package com.rmhan.itf;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.rmhan.itf.api.ApiClient;
import com.rmhan.itf.api.ApiInterface;
import com.rmhan.itf.model.contact.Contact;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SupportActivity extends Fragment implements View.OnClickListener {
    EditText etOrderId, etPassword, etChat, etPhone, etEmail;
    SessionManager sessionManager;
    String email, phone;
    Button btnSubmit;
    ApiInterface apiInterface;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_support, container, false);
        sessionManager = new SessionManager(getActivity());
        if (!sessionManager.isLoggedIn()) {
            // Handle the case when the user is not logged in
        }

        etEmail = view.findViewById(R.id.emailEditText);
        email = sessionManager.getUserDetail().get(SessionManager.EMAIL);

        etPhone = view.findViewById(R.id.phoneeditText);
        phone = sessionManager.getUserDetail().get(SessionManager.PHONE);

        etEmail.setText(email);
        etPhone.setText(phone);
        etEmail = view.findViewById(R.id.emailEditText);
        etOrderId = view.findViewById(R.id.orderText);
        etPhone = view.findViewById(R.id.phoneeditText);
        etPassword = view.findViewById(R.id.passwordText);
        etChat = view.findViewById(R.id.chatText);

        btnSubmit = view.findViewById(R.id.btn_submit);
        btnSubmit.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_submit) {
            String email = etEmail.getText().toString();
            String orderId = etOrderId.getText().toString();
            String phone = etPhone.getText().toString();
            String password = etPassword.getText().toString();
            String chat = etChat.getText().toString();
            support(email, orderId, phone, password, chat);
        } else if (v.getId() == R.id.tvLoginHere) {
            Intent intent = new Intent(getActivity(), TombolActivity.class);
            startActivity(intent);
            // There's no 'view' in this context, assuming it's meant to refer to the current activity
            getActivity().finish();
        }
    }

    private void support(String orderId, String password, String message, String email, String phone) {
        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<Contact> call = apiInterface.contactResponse(orderId, password, message, email, phone);
        call.enqueue(new Callback<Contact>() {
            @Override
            public void onResponse(Call<Contact> call, Response<Contact> response) {
                if (response.body() != null && response.isSuccessful() && response.body().isStatus()) {
                    Toast.makeText(getContext(), response.body().getMessage(), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getActivity(), TombolActivity.class);
                    startActivity(intent);

                    getActivity().finish();
                } else {
                    Toast.makeText(getContext(), response.body().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Contact> call, Throwable t) {
                Toast.makeText(getContext(), t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

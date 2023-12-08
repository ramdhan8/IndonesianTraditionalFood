package com.rmhan.itf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class ProfilActivity extends Fragment {
Button btnLogout;
    TextView etUsername, etName, etPhone, etEmail;
    SessionManager sessionManager;
    String username, name, email, phone;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_profil, container, false);

        sessionManager = new SessionManager(getActivity());
        if(!sessionManager.isLoggedIn()){
            // moveToLogin();
        }
        etUsername = view.findViewById(R.id.ppUsername);
        username = sessionManager.getUserDetail().get(SessionManager.USERNAME);

        etName = view.findViewById(R.id.ppNama);
        name = sessionManager.getUserDetail().get(SessionManager.NAME);

        etEmail = view.findViewById(R.id.ppEmail);
        email = sessionManager.getUserDetail().get(SessionManager.EMAIL);

        etPhone = view.findViewById(R.id.ppNohp);
        phone = sessionManager.getUserDetail().get(SessionManager.PHONE);

        etName.setText(name);
        etUsername.setText(username);
        etEmail.setText(email);
        etPhone.setText(phone);
        Button btnLogout = view.findViewById(R.id.btn_logout); // Ganti dengan ID tombol logout yang sesuai

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil moveToLogin() saat tombol logout diklik
                moveToLogin();
            }
        });
        return view;
    }
    private void moveToLogin() {
        Intent intent = new Intent(getActivity(), LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent);
        getActivity().finish();
    }
}
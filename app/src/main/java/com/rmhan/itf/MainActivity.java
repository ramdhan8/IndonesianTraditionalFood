package com.rmhan.itf;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

    TextView etUsername, etName;
    SessionManager sessionManager;
    String username, name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));
//        sessionManager = new SessionManager(MainActivity.this);
//        if(!sessionManager.isLoggedIn()){
//           // moveToLogin();
//        }
//
//        etUsername = findViewById(R.id.etMainUsername);
//        etName = findViewById(R.id.etMainName);
//
//        username = sessionManager.getUserDetail().get(SessionManager.USERNAME);
//        name = sessionManager.getUserDetail().get(SessionManager.NAME);
//
//        etUsername.setText(username);
//        etName.setText(name);

    }

//    private void moveToLogin() {
//        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NO_HISTORY);
//        startActivity(intent);
//        finish();
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu, menu);
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()){
//            case R.id.actionLogout:
//                sessionManager.logoutSession();
//                moveToLogin();
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
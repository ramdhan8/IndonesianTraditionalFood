package com.rmhan.itf;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.rmhan.itf.MainActivity;
import com.rmhan.itf.ProfilActivity;
import com.rmhan.itf.PembayaranActivity;
import com.rmhan.itf.SupportActivity;


public class TombolActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tombol);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        loadFragment(new DashboardActivity());

        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;

                if (item.getItemId() == R.id.navigation_home) {
                    fragment = new DashboardActivity();
                } else if (item.getItemId() == R.id.navigation_profil) {
                    fragment = new ProfilActivity();
                }else if (item.getItemId() == R.id.navigation_support) {
                    fragment = new SupportActivity();
                }

                return loadFragment(fragment);
            }
        });
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.fragment_container, fragment);
            transaction.commit();
            return true;
        }
        return false;
    }
}
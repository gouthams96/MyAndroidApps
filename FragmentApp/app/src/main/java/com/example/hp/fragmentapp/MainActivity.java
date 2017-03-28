package com.example.hp.fragmentapp;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void changeFragment(View view){
        if(view.getId() == R.id.signUpButton){
            getSupportFragmentManager().beginTransaction().replace(R.id.mainFragment,new SignUpFragment())
                    .addToBackStack(null).commit();

        }
        if(view.getId() == R.id.registerButton){
            getSupportFragmentManager().beginTransaction().replace(R.id.mainFragment,new RegisterFragment())
                    .addToBackStack(null).commit();
       }

    }
}

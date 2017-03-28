package com.example.hp.fragmentapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class SignUpFragment extends Fragment {
    Button submit;
    EditText username;
    EditText password;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        submit =(Button) getActivity().findViewById(R.id.sign);
        username = (EditText) getActivity().findViewById(R.id.username);
        password = (EditText) getActivity().findViewById(R.id.password);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!username.getText().toString().isEmpty() && !password.getText().toString().isEmpty()){
                    Intent gotoNextActivity = new Intent(getActivity().getApplicationContext(),HomeScreen.class);
                    gotoNextActivity.putExtra("User",username.getText().toString());
                    startActivity(gotoNextActivity);
                }else{
                    Toast.makeText(getActivity(),"Empty (Username) or Empty (Password) !",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

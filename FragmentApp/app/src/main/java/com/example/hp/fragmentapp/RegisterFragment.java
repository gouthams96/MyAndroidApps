package com.example.hp.fragmentapp;

import android.app.DatePickerDialog;
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
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;


public class RegisterFragment extends Fragment {

   Button submit,dob;
    int yy,mm,dd;
   EditText password,confirmPassword,showDate;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        submit = (Button)  getActivity().findViewById(R.id.submit);
        password =(EditText) getActivity().findViewById(R.id.textPassword);
        confirmPassword =(EditText) getActivity().findViewById(R.id.password);
        dob = (Button) getActivity().findViewById(R.id.dob);
        showDate = (EditText) getActivity().findViewById(R.id.showDate);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(password.getText().toString().equals(confirmPassword.getText().toString())){
                    Intent ShowStatus = new Intent(getActivity().getApplicationContext(),RegistrationStatus.class);
                    startActivity(ShowStatus);
                }else{
                    Toast.makeText(getActivity(),"Password Incorrect !",Toast.LENGTH_LONG).show();
                }

            }
        });
        dob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();
                yy = c.get(Calendar.YEAR);
                mm = c.get(Calendar.MONTH);
                dd = c.get(Calendar.DATE);

                DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                         showDate.setText(dayOfMonth+"/"+(monthOfYear+1)+"/"+year);
                    }
                }
                ,dd,mm,yy);
                datePickerDialog.show();
            }
        });
    }
}

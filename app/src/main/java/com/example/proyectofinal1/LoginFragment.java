package com.example.proyectofinal1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.proyectofinal1.View.CallFragment;


public class LoginFragment extends Fragment {
    
    Button btnLogin,btnRegistro;
    EditText etUserName, etPassword;
    CallFragment callFragment;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,@Nullable ViewGroup container,@Nullable
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login,container,false);
        etUserName = view.findViewById(R.id.etUserName);
        etPassword = view.findViewById(R.id.etPassword);

        btnLogin = view.findViewById(R.id.btnLogin);
        btnRegistro = view.findViewById(R.id.btnRegistro);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(callFragment!=null){
                    callFragment.changeFragment();
                }
            }
        });


        return  view;
    }
    public void setCallFragment (CallFragment callFragment){
        this.callFragment = callFragment;
    }
}
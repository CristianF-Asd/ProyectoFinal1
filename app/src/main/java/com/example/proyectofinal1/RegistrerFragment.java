package com.example.proyectofinal1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class RegistrerFragment extends Fragment {

    EditText et_username,et_correo, et_contrasena, et_contrasena2;

    private DBHelper dbHelper;

    Button button_reg;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_registrer,container,false);

        et_username = view.findViewById(R.id.et_username);
        et_correo = view.findViewById(R.id.et_correo);
        et_contrasena = view.findViewById(R.id.et_contrasena);
        et_contrasena2 = view.findViewById(R.id.et_contrasena2);

        button_reg = view.findViewById(R.id.button_reg);

        button_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return  view;
    }
}
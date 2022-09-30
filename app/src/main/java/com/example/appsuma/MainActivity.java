package com.example.appsuma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.appsuma.databinding.ActivityMainBinding;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {

    /*private EditText edt1;
    private EditText edt2;
    private TextView txv1;*/
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //OPCION 2
        binding.btnSuma.setOnClickListener(view -> {
            Sumar();
        });
        //OPCION 3
        //binding.btnSuma.setOnClickListener(this);//hacer click en el error para implementar lo que falta

        /*edt1 = (EditText)findViewById(R.id.ed1);
        edt2 = (EditText) findViewById(R.id.ed2);
        txv1 = (TextView) findViewById(R.id.textR);*/
    }
    //OPCION 1
    public void Sumar(/*View view*/){
        /*int n1 = Integer.parseInt(edt1.getText().toString());
        int n2 = Integer.parseInt(edt2.getText().toString());*/

        int suma = Integer.parseInt(binding.ed1.getText().toString()) + Integer.parseInt(binding.ed2.getText().toString());
        binding.textR.setText(String.valueOf(suma));
    }
}
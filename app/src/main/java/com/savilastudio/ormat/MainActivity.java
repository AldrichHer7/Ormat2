package com.savilastudio.ormat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button iniciarSesion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciarSesion = (Button)findViewById(R.id.iniciarSesion);
        iniciarSesion.setOnClickListener(this::onClick);

    }
    public void onClick(View view){
        if (view == iniciarSesion){
            iniciarSesion_OnClick();
        }
    }

    public void iniciarSesion_OnClick(){
        Intent intent = new Intent(this, PantallaInicial.class );
        startActivity(intent);
        finish();
    }
}
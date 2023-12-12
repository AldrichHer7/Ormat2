package com.savilastudio.ormat.ui.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.savilastudio.ormat.R;

public class InformacionMateria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_materia);
    }
    class HomeButton extends Activity {
        static int numCards = 1;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.fragment_home);

            LinearLayout agregarTarjeta = (LinearLayout) findViewById(R.id.agregarTarjeta);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT );

            //Creamos los botones en bucle
            for (int i=0; i<numCards; i++){
                CardView cardView = new CardView(this);
                //Asignamos propiedades de layout al boton
                cardView.setLayoutParams(lp);
                //Asignamos Texto al botón
                //cardView.("Boton "+String.format("%02d", i ));
                //Asignamose el Listener
                cardView.setOnClickListener(new ButtonsOnClickListener());
                //Añadimos el botón a la botonera
                agregarTarjeta.addView(cardView);
            }
        }

        class ButtonsOnClickListener implements View.OnClickListener
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(),"Pulsado", Toast.LENGTH_SHORT).show();
            }
        };
    }

}
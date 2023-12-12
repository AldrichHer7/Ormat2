package com.savilastudio.ormat.ui.home;


import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.savilastudio.ormat.R;
import com.savilastudio.ormat.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
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

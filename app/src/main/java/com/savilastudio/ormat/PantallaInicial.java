package com.savilastudio.ormat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.savilastudio.ormat.databinding.ActivityPantallaInicialBinding;

public class PantallaInicial extends AppCompatActivity {
    Button salir;

    private ActivityPantallaInicialBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPantallaInicialBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_pantalla_inicial);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_pantalla_inicial);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        salir = (Button)findViewById(R.id.salir);
        salir.setOnClickListener(this::onClick);


    }


    public void onClick(View view){
        if (view == salir){
            salir_OnClicK();
        }
    }

    public void salir_OnClicK(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }



}
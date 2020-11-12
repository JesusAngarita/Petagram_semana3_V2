package com.jesusangarita.petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<Perro> perros;
    private RecyclerView rvPerro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar actionBar = (Toolbar) findViewById(R.id.actionBar);
        setSupportActionBar(actionBar);

        rvPerro = (RecyclerView) findViewById(R.id.rvPerro);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        rvPerro.setLayoutManager(llm);
        iniciarPerros();
        inicializarAdaptador();
    }

    public void iniciarPerros(){
        perros = new ArrayList< Perro >();

        perros.add(new Perro(R.drawable.perro_uno, "Dollar", "5"));
        perros.add(new Perro(R.drawable.perro_dos, "Killer", "4"));
        perros.add(new Perro(R.drawable.perro_tres, "Firulais", "3"));
        perros.add(new Perro(R.drawable.perro_cuatro, "Tony", "2"));
        perros.add(new Perro(R.drawable.perro_cinco, "Satanas", "1 "));
    }

    public void inicializarAdaptador(){
        Adaptador adaptador = new Adaptador(perros, this);

        rvPerro.setAdapter(adaptador);
    }

    public void  mostrarMascotasSeguidas(View v){
        Intent intent = new Intent(this, DetalleMascota.class);
        startActivity(intent);
    }
}
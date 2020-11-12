package com.jesusangarita.petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class DetalleMascota extends AppCompatActivity {

    ArrayList<Perro> perros;
    private RecyclerView rvPerroSeguido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mascota_det);

        Toolbar actionBar = (Toolbar) findViewById(R.id.actionBar);
        setSupportActionBar(actionBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rvPerroSeguido = (RecyclerView) findViewById(R.id.rvPerroSeguido);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        rvPerroSeguido.setLayoutManager(llm);
        iniciarPerros();
        inicializarAdaptador();
    }

    public void iniciarPerros(){
        perros = new ArrayList< Perro >();

        perros.add(new Perro(R.drawable.perro_uno, "Dollar", "5"));
        perros.add(new Perro(R.drawable.perro_cuatro, "Tony", "4"));
        perros.add(new Perro(R.drawable.perro_dos, "Killer", "3"));
        perros.add(new Perro(R.drawable.perro_seis, "Maximo", "3"));
        perros.add(new Perro(R.drawable.perro_siete, "Dare_Devil", "2"));

    }

    public void inicializarAdaptador(){
        Adaptador adaptador = new Adaptador(perros, this);

        rvPerroSeguido.setAdapter(adaptador);
    }
}
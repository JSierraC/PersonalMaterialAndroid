package com.example.personalmaterial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;

public class AgregarPersona extends AppCompatActivity {
    private ArrayList<Integer> fotos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_persona);
        fotos.add(R.drawable.image);
        fotos.add(R.drawable.image2);
    }

    public int fotoAleatorio(){
        int fotoSelecionada;
        Random r = new Random();
        fotoSelecionada = r.nextInt(this.fotos.size());
        return fotos.get(fotoSelecionada);
    }
}

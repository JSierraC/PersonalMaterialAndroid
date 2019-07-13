package com.example.personalmaterial;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Random;

public class AgregarPersona extends AppCompatActivity {
    private ArrayList<Integer> fotos;
    private EditText nombre , apellido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_persona);
        fotos.add(R.drawable.image);
        fotos.add(R.drawable.image2);
        nombre = findViewById(R.id.txtNombre);
        apellido = findViewById(R.id.txtApellido);
    }

    public void guardar(View v){
        String nom, apel, id;
        int foto;
        id = Datos.getId();
        nom = nombre.getText().toString();
        apel = apellido.getText().toString();
        foto = this.fotoAleatorio();
        Persona P = new Persona(id, foto, nom, apel);
        P.guardar();
        limpiar();
        Snackbar.make(v,"Persona Guardada Exitosamente",Snackbar.LENGTH_LONG).show();
    }

    public void limpiar(View v){
        limpiar();
    }

    public void limpiar(){
        nombre.setText("");
        apellido.setText("");
        nombre.requestFocus();
    }

    public int fotoAleatorio(){
        int fotoSelecionada;
        Random r = new Random();
        fotoSelecionada = r.nextInt(this.fotos.size());
        return fotos.get(fotoSelecionada);
    }
}

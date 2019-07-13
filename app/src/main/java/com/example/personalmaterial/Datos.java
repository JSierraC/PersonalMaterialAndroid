package com.example.personalmaterial;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class Datos {
    private static String db ="Personas";

    private static DatabaseReference
            databaseReference = FirebaseDatabase.getInstance().getReference();
    public static ArrayList<Persona> persona = new ArrayList<>();

    public static void agregar(Persona p){
        databaseReference.child(db).child(p.getId()).setValue(p);
    }

    public static void editar(Persona p){
        databaseReference.child(db).child(p.getId()).setValue(p);
    }

    public static void eliminar(Persona p){
        databaseReference.child(db).child(p.getId()).removeValue();
    }

    public static String getId(){
        return databaseReference.push().getKey();
    }

    public static void setPersonas(ArrayList<Persona> personas){
        Datos.persona = personas;
    }

    public static ArrayList<Persona> obtener(){
        return Datos.persona;
    }
}

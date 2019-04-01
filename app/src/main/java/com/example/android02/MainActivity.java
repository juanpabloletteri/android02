package com.example.android02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PersonaModel personaModel = new PersonaModel();
        ListenerControlador listenerControlador = new ListenerControlador(personaModel);
        PersonaView personaView = new PersonaView(this, listenerControlador);
        listenerControlador.setView(personaView);

    }
}

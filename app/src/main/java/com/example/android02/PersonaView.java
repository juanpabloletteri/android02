package com.example.android02;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class PersonaView {

    EditText editNombre ;
    EditText editApellido;
    EditText editDni;
    RadioButton radioHombre;
    RadioButton radioMujer;

    public PersonaView(Activity activity, ListenerControlador controlador) {

        Button btnGuardar = (Button) activity.findViewById(R.id.btnGuardar);
        btnGuardar.setOnClickListener(controlador);

        editNombre = (EditText) activity.findViewById(R.id.editNombre);
        editApellido = (EditText) activity.findViewById(R.id.editApellido);
        editDni = (EditText) activity.findViewById(R.id.editDni);
        radioHombre = (RadioButton) activity.findViewById(R.id.radioHombre);
        radioMujer = (RadioButton) activity.findViewById(R.id.radioMujer);

    }
}

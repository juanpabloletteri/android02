package com.example.android02;

import android.util.Log;
import android.view.View;

public class ListenerControlador implements View.OnClickListener {

    PersonaView view;
    PersonaModel model;

    public ListenerControlador(PersonaModel model) {
        this.model = model;
    }

    @Override
    public void onClick(View v) {

        model = new PersonaModel();
        model.setNombre(view.editNombre.getText().toString());
        model.setApellido(view.editApellido.getText().toString());
        model.setDni(Integer.valueOf(view.editDni.getText().toString()));
        // FIXME: 31/3/2019
        if(view.radioHombre.isChecked()){
            model.setSexo(view.radioHombre.getText().toString());
        }
        else if(view.radioMujer.isChecked()){
            model.setSexo(view.radioMujer.getText().toString());
        }

        Log.d("persona",model.toString());
    }

    public void setView(PersonaView view){
        this.view = view;
    }

}

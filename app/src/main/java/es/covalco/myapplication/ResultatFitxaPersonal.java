package es.covalco.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.widget.EditText;


public class ResultatFitxaPersonal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat_fitxa_personal);
        recollir();
    }

    public void recollir(){
        Intent intentExtras = getIntent();

        Bundle extras = intentExtras.getExtras();
        String idNom = extras.getString("idNom");
        ((EditText)findViewById(R.id.idNom)).setText(idNom);

    }
}

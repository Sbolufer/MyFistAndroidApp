package es.covalco.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.EditText;


public class Resultat_Fitxa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat__fitxa);
        recollir();
    }

    public void recollir(){
        Intent intentExtras = getIntent();

        Bundle extras = intentExtras.getExtras();
        String idNom = extras.getString("idNom");
        ((EditText)findViewById(R.id.Nom)).setText(idNom);

    }
}

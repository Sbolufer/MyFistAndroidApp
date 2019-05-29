package es.covalco.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import javax.security.auth.Subject;

import static android.widget.Toast.*;

public class FitxaPersonal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitxa_personal);
    }

    public void OnClick(View view) {

        Toast.makeText(getApplicationContext(),"Enviat Correctament!!", LENGTH_LONG).show();
        Cridar();
    }

    public void Cridar() {
        Intent intentBuddle = new Intent(FitxaPersonal.this,Resultat_Fitxa.class);
        Bundle bundle = new Bundle();
        String Nom = ((EditText)findViewById(R.id.idNom)).getText().toString();
        bundle.putString("idNom", Nom);
        intentBuddle.putExtras(bundle);
        startActivity(intentBuddle);
    }

    public void OnClick1(View view) {
        Intent messageIntent = new Intent(Intent.ACTION_SEND);

        String aEmailList[] = {};
        messageIntent.putExtra(Intent.EXTRA_EMAIL, aEmailList);

        String subject = "";
        messageIntent.putExtra(Intent.EXTRA_SUBJECT, subject);

        String message = "Uyyyyyy";
        messageIntent.setType("plain/text");
        messageIntent.putExtra(Intent.EXTRA_TEXT, message);

        startActivity(messageIntent);
    }
}

package es.covalco.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.graphics.Color;


// Per heredar amb extends
// Per implementar amb imports
public class MainActivity extends AppCompatActivity {

    //private Button btnAdd;
    //private Button btnSubstract;
    private EditText txtNum1;
    private EditText txtNum2;
    String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Grape", "Kiwi", "Mango", "Pear"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // No cal perquè ja hem assignat al OnClick dins les propietats del botò.
        //btnAdd          = (Button) findViewById(R.id.btnAdd);
        //btnSubstract    = (Button) findViewById(R.id.btnSubstract);

        txtNum1         = (EditText) findViewById(R.id.txtNum1);
        txtNum2         = (EditText) findViewById(R.id.txtNum2);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, fruits);

        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        actv.setThreshold(1);//will start working from first character
        actv.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
        actv.setTextColor(Color.RED);
        }

    public void OnClick(View view)
    {
        int num1=Integer.parseInt(txtNum1.getText().toString());
        int num2=Integer.parseInt(txtNum2.getText().toString());
        //int result = num1+num2;

        ICalculator iCalculator = new Calculator(num1,num2);
        int result = iCalculator.add();
        Toast.makeText(getApplicationContext(),"Resultat Suma --> : "+ result, Toast.LENGTH_LONG).show();
    }

    public void OnClickSubstract(View view)
    {
        int num1=Integer.parseInt(txtNum1.getText().toString());
        int num2=Integer.parseInt(txtNum2.getText().toString());

        //int result = num1-num2;
        ICalculator iCalculator = new Calculator(num1,num2);
        int result = iCalculator.substract();
        Toast.makeText(getApplicationContext(),"Resultat Resta -->: "+ result, Toast.LENGTH_LONG).show();
    }

    public void OnClickMultiply(View view)
    {
        int num1=Integer.parseInt(txtNum1.getText().toString());
        int num2=Integer.parseInt(txtNum2.getText().toString());

        //int result = num1-num2;
        ICalculator iCalculator = new Calculator(num1,num2);
        int result = iCalculator.multiply();
        Toast.makeText(getApplicationContext(),"Resultat Multiplicació -->: "+ result, Toast.LENGTH_LONG).show();
    }

    public void OnClickDivide(View view)
    {
        int num1=Integer.parseInt(txtNum1.getText().toString());
        int num2=Integer.parseInt(txtNum2.getText().toString());

        //int result = num1-num2;
        ICalculator iCalculator = new Calculator(num1,num2);
        int result = iCalculator.divide();
        Toast.makeText(getApplicationContext(),"Resultat Divisió -->: "+ result, Toast.LENGTH_LONG).show();
    }
}

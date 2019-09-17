package com.example.androidmenusimples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        EditText etVal1 = findViewById(R.id.idEtVal1);
        EditText etVal2 = findViewById(R.id.idEtVal2);
        int val1 = Integer.parseInt(etVal1.getText().toString());
        int val2 = Integer.parseInt(etVal2.getText().toString());
        TextView resultado = findViewById(R.id.resultado);
        switch (item.getItemId()) {
            case R.id.soma :
                resultado.setText(String.valueOf(val1 + val2));
                break;
            case R.id.subtracao:
                resultado.setText(String.valueOf(val1 - val2));
                break;
            case R.id.multiplicacao:
                resultado.setText(String.valueOf(val1 * val2));
                break;
            case R.id.divisao:
                resultado.setText(String.valueOf(val1 / val2));
                break;
        }
        return true;
    }


}

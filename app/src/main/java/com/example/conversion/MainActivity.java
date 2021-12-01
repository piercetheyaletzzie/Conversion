package com.example.conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView currency;


    public void convertir(View view) {
        EditText editText = findViewById(R.id.editTextVal);
        String Cantidad = editText.getText().toString();
        double CantidadPuesta = Double.parseDouble(Cantidad);


        double dolares = CantidadPuesta * 21.44;
        currency = (TextView) findViewById(R.id.textViewdls);
        currency.setText("" + dolares);

        double yenes = CantidadPuesta * 5.28;
        currency = (TextView) findViewById(R.id.textViewyn);
        currency.setText("" + yenes);

        double chilenos = CantidadPuesta * 38.59;
        currency = (TextView) findViewById(R.id.textViewchl);
        currency.setText("" + chilenos);

        double esterlinas = CantidadPuesta * 0.035;
        currency = (TextView) findViewById(R.id.textViewest);
        currency.setText("" + esterlinas);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
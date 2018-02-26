package com.example.alexa.listbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private Spinner spi;
    private EditText ED;
    private TextView TV, One, qone;
    private Button save;
    private String str1 = "";
    private String str2 = "";
    private String [] str = {"Bière", "Vodka", "Tequila", "Mojito", "Planteur", "Pina Colada"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ED = findViewById(R.id.editText);
        spi = findViewById(R.id.spinner);
        save = findViewById(R.id.save);
        One = findViewById(R.id.one);
        qone = findViewById(R.id.qone);
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, str);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spi.setAdapter(dataAdapter);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str1 = str1 + spi.getSelectedItem().toString() +'\n';
                str2 = str2 + ED.getText().toString() + '\n';
                One.setText(str1);
                qone.setText(str2);

            }
        });
    }
}

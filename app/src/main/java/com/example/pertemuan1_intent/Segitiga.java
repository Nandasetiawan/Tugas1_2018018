package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {
    double number1, number2, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        final EditText  alas =
                (EditText)findViewById(R.id.input_alas);
        final EditText tinggi =
                (EditText)findViewById(R.id.input_tinggi);
        final Button hitung =
                (Button)findViewById(R.id.btn_hitung);
        final TextView luas =
                (TextView)findViewById(R.id.output_hasil);
        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(alas.getText().toString());
                number2 = Integer.parseInt(tinggi.getText().toString());
                result = 0.5 * number1 * number2;
                luas.setText(String.valueOf(result));
            }
        });
    }
}
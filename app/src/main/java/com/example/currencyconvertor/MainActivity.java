package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.FileObserver;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    Button dollar;
    Button euro;
    Button taka;
    Button dirham;
    Button lari;
    Button naira;
    Button israeli_shekel;
    Button bu;
    Button southk;
    TextView textView;
    EditText editText;
//    EditText editText;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        euro = findViewById(R.id.euro);
        taka = findViewById(R.id.taka);
        dirham = findViewById(R.id.dirham);
        lari = findViewById(R.id.lari);
        naira = findViewById(R.id.naira);
        bu = findViewById(R.id.bu);
        southk = findViewById(R.id.southk);
        israeli_shekel = findViewById(R.id.israeli_shekel);

        dollar = findViewById(R.id.dollar);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);

        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                if(TextUtils.isEmpty(s))
                {
                    editText.setError("Empty user Input");
                }
                else
                {
                    double n, k;
                    n = Double.parseDouble(s);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n* 0.013;
                    DecimalFormat number= new DecimalFormat("#.00");
                    textView.setText("$ "+ number.format(k));
                }
            }
        });

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                if(TextUtils.isEmpty(s))
                {
                    editText.setError("Empty user Input");
                }
                else
                {
                    double n, k;
                    n = Double.parseDouble(s);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n* 0.012;
                    DecimalFormat number= new DecimalFormat("#.00");
                    textView.setText("€ "+ number.format(k));
                }
            }
        });

        taka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                if(TextUtils.isEmpty(s))
                {
                    editText.setError("Empty user Input");
                }
                else
                {
                    double n, k;
                    n = Double.parseDouble(s);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n* 1.11;
                    DecimalFormat number= new DecimalFormat("#.00");
                    textView.setText("৳ "+ number.format(k));
                }
            }
        });

        dirham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                if(TextUtils.isEmpty(s))
                {
                    editText.setError("Empty user Input");
                }
                else
                {
                    double n, k;
                    n = Double.parseDouble(s);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n* 0.048;
                    DecimalFormat number= new DecimalFormat("#.00");
                    textView.setText("د.م "+ number.format(k));
                }
            }
        });

        lari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                if(TextUtils.isEmpty(s))
                {
                    editText.setError("Empty user Input");
                }
                else
                {
                    double n, k;
                    n = Double.parseDouble(s);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n* 0.041;
                    DecimalFormat number= new DecimalFormat("#.00");
                    textView.setText("  \u20BE  "+ number.format(k));
                }
            }
        });

        naira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                if(TextUtils.isEmpty(s))
                {
                    editText.setError("Empty user Input");
                }
                else
                {
                    double n, k;
                    n = Double.parseDouble(s);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n* 4.80;
                    DecimalFormat number= new DecimalFormat("#.00");
                    textView.setText("₦ "+ number.format(k));
                }
            }
        });

        israeli_shekel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                if(TextUtils.isEmpty(s))
                {
                    editText.setError("Empty user Input");
                }
                else
                {
                    double n, k;
                    n = Double.parseDouble(s);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n* 0.048;
                    DecimalFormat number= new DecimalFormat("#.00");
                    textView.setText("₪ "+ number.format(k));
                }
            }
        });

        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                if(TextUtils.isEmpty(s))
                {
                    editText.setError("Empty user Input");
                }
                else
                {
                    double n, k;
                    n = Double.parseDouble(s);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n* 0.024;
                    DecimalFormat number= new DecimalFormat("#.00");
                    textView.setText("лв "+ number.format(k));
                }
            }
        });

        southk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                if(TextUtils.isEmpty(s))
                {
                    editText.setError("Empty user Input");
                }
                else
                {
                    double n, k;
                    n = Double.parseDouble(s);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n* 16.18;
                    DecimalFormat number= new DecimalFormat("#.00");
                    textView.setText("₩ "+ number.format(k));
                }
            }
        });




    }
}

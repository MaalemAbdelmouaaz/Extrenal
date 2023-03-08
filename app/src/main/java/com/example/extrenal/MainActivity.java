package com.example.extrenal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result_name;
    EditText barcode;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result_name = findViewById(R.id.nom);
        button = findViewById(R.id.button);
        barcode = findViewById(R.id.barcode);
        button.setOnClickListener(view -> {
            DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
            databaseAccess.open();
            String fn = barcode.getText().toString();
            long n = Long.parseLong(fn);
            String product_name = databaseAccess.getProductName(n);
            result_name.setText(product_name);
            databaseAccess.close();
        });


    }
}
package com.kls.bcamobile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView m;
    ImageView img2;
    ImageView img1;
    EditText edt_pin;
    AlertDialog.Builder dialog;
    LayoutInflater inflater;
    View dialogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m = findViewById(R.id.card_m);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogForm();
            }
        });
    }

    private void DialogForm() {
        dialog = new AlertDialog.Builder(MainActivity.this);
        inflater = getLayoutInflater();
        dialogView = inflater.inflate(R.layout.pin, null);
        dialog.setView(dialogView);

        dialog.setCancelable(true);

        img2 = dialogView.findViewById(R.id.imageView2);
        edt_pin = dialogView.findViewById(R.id.editText);

        img1 = dialogView.findViewById(R.id.imageView);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edt_pin.getText().toString().equals("788920")){
                    startActivity(new Intent(MainActivity.this, SaldoActivity.class));
                }else {
                    Toast.makeText(MainActivity.this, "Pin Tidak Ditemukan", Toast.LENGTH_SHORT).show();
                }
            }
        });


        dialog.show();
    }
}

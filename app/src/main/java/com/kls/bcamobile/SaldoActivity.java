package com.kls.bcamobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SaldoActivity extends AppCompatActivity {

    TextView txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saldo);
        txt3 = findViewById(R.id.textView3);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM HH:mm:ss", Locale.getDefault());
        String currentDateandTime = sdf.format(new Date());
        txt3.setText(currentDateandTime);
    }
}

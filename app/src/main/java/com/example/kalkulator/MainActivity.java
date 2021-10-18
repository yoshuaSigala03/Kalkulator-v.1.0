package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.String;

public class MainActivity extends AppCompatActivity {
    EditText mInputPAD;
    EditText mInputLT;
    TextView mHasilLuas;
    TextView mHasilKeliling;
    Button mBtnPersegi;
    Button mBtnSegitiga;
    Button mBtnLingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInputPAD = (EditText) findViewById(R.id.InputPAD);
        mInputLT = (EditText) findViewById(R.id.InputLT);

        mHasilLuas = (TextView) findViewById(R.id.HasilLuas);
        mHasilKeliling = (TextView) findViewById(R.id.HasilKeliling);

        mBtnPersegi = (Button) findViewById(R.id.BtnPersegi);
        mBtnSegitiga = (Button) findViewById(R.id.BtnSegitiga);
        mBtnLingkaran = (Button) findViewById(R.id.BtnLingkaran);

        mBtnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hitung1();
            }
        });

        mBtnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hitung2();
            }
        });

        mBtnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hitung3();
            }
        });

    }

    public void Hitung1(){
        Double value1 = Double.parseDouble(mInputPAD.getText().toString());
        Double value2 = Double.parseDouble(mInputLT.getText().toString());
        Double Hitung1Value1 = value1*value2;
        mHasilLuas.setText(Hitung1Value1.toString());
        Double Hitung1Value2 = (value1*2) + (value2)*2;
        mHasilKeliling.setText(Hitung1Value2.toString());
    }

    public void Hitung2(){
        Double value1 = Double.parseDouble(mInputPAD.getText().toString());
        Double value2 = Double.parseDouble(mInputLT.getText().toString());
        Double Hitung2Value1 = (value1*0.5) * value2;
        mHasilLuas.setText(Hitung2Value1.toString());
        Double Hitung2Value2 = value1*3;
        mHasilKeliling.setText(Hitung2Value2.toString());
    }

    public void Hitung3(){
        Double value1 = Double.parseDouble(mInputPAD.getText().toString());
        Double value2 = Double.parseDouble(mInputLT.getText().toString());
        Double Hitung3Value1 = 3.14 * 0.25 * (value1*value1);
        mHasilLuas.setText(Hitung3Value1.toString());
        Double Hitung3Value2 = value1*3.14;
        mHasilKeliling.setText(Hitung3Value2.toString());
    }


}
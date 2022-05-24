package com.example.lelamnhan_61133258bai1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText canhday = findViewById(R.id.day);
        EditText canhben = findViewById(R.id.ben);
        EditText chieucao = findViewById(R.id.cao);
        Button tinhchuvi = findViewById(R.id.Chuvi_button);
        Button tinhdientich = findViewById(R.id.Dientich_button);
        TextView Ketqua = findViewById(R.id.result);

        tinhdientich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cao = Integer.parseInt(chieucao.getText().toString());
                int day = Integer.parseInt(canhday.getText().toString());
                int kqua = day * cao;
                Ketqua.setText("Dien tich hinh binh hanh la: " + kqua);
            }
        });


        tinhchuvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int day = Integer.parseInt(canhday.getText().toString());
                int ben = Integer.parseInt(canhben.getText().toString());
                int kqua = 2 * (day + ben);
                Ketqua.setText("Chu vi hinh binh hanh la: " + kqua);
            }
        });
    }
}
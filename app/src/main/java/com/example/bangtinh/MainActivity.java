package com.example.bangtinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText_hesoA = findViewById(R.id.et_hesoA);
        EditText editText_hesoB = findViewById(R.id.et_hesoB);
        Button button_Tong = findViewById(R.id.bt_tong);
        Button button_Hieu = findViewById(R.id.bt_hieu);
        Button button_Nhan = findViewById(R.id.bt_nhan);
        Button button_Chia = findViewById(R.id.bt_chia);
        TextView textView_ketqua = findViewById(R.id.tv_ketqua);

        button_Tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(editText_hesoA.getText().toString());
                int b = Integer.parseInt(editText_hesoB.getText().toString());
                int c = a + b;
                textView_ketqua.setText("Tong la: " + c);
            }
        });
        button_Hieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(editText_hesoA.getText().toString());
                int b = Integer.parseInt(editText_hesoB.getText().toString());
                int c = a - b;
                textView_ketqua.setText("Hieu la: " + c);
            }
        });
        button_Nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(editText_hesoA.getText().toString());
                int b = Integer.parseInt(editText_hesoB.getText().toString());
                int c = a * b;
                textView_ketqua.setText("Nhan la: " + c);
            }
        });
        button_Chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(editText_hesoA.getText().toString());
                int b = Integer.parseInt(editText_hesoB.getText().toString());
                int c = a / b;
                textView_ketqua.setText("Chia la: " + c);
            }
        });
    }
}
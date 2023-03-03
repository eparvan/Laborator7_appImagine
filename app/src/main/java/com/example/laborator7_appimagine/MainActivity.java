package com.example.laborator7_appimagine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView imageView;
    Button btn1,btn2, btn3, btn4, btn5, btn6, btn7, btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imgView1);
         btn1 =(Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
         btn2 =(Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
         btn3 =(Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
         btn4 =(Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
         btn5 =(Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
         btn6 =(Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(this);
         btn7 =(Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(this);
         btn8 =(Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                Toast.makeText(getApplicationContext(),"ScaleTypeCenter", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                Toast.makeText(getApplicationContext(),"ScaleTypeCenterCrop", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn3:
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                Toast.makeText(getApplicationContext(),"ScaleTypeCenterInside", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn4:
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                Toast.makeText(getApplicationContext(),"ScaleTypeFitCenter", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn5:
                imageView.setScaleType(ImageView.ScaleType.FIT_END);
                Toast.makeText(getApplicationContext(),"ScaleTypeFITEND", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn6:
                imageView.setScaleType(ImageView.ScaleType.FIT_START);
                Toast.makeText(getApplicationContext(),"ScaleTypeFITStart", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn7:
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                Toast.makeText(getApplicationContext(),"ScaleTypeFITXY", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn8:
                imageView.setScaleType(ImageView.ScaleType.MATRIX);
                Toast.makeText(getApplicationContext(),"ScaleTypeMztrix", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
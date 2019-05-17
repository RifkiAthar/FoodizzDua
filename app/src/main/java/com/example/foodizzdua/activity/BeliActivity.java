package com.example.foodizzdua.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.foodizzdua.R;

public class BeliActivity extends AppCompatActivity implements View.OnClickListener {
    private Button kurang1, kurang2, kurang3, tambah1, tambah2, tambah3;
    private TextView jumlah1, jumlah2, jumlah3, totalBelanjaan;
    private int satu = 0;
    private int dua = 0;
    private int tiga = 0;
    private int totalbelanja = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beli);
         kurang1 =(Button) findViewById(R.id.button3);
         kurang2 =(Button) findViewById(R.id.button5);
         kurang3 =(Button) findViewById(R.id.button7);
         tambah1 =(Button) findViewById(R.id.button4);
         tambah2 =(Button) findViewById(R.id.button6);
         tambah3 =(Button) findViewById(R.id.button8);
         jumlah1 =(TextView) findViewById(R.id.textView15);
         jumlah2 =(TextView) findViewById(R.id.textView16);
         jumlah3 =(TextView) findViewById(R.id.textView17);
         totalBelanjaan = (TextView) findViewById(R.id.total_belanjaan) ;
        kurang1.setOnClickListener(this);
        kurang2.setOnClickListener(this);
        kurang3.setOnClickListener(this);
        tambah1.setOnClickListener(this);
        tambah2.setOnClickListener(this);
        tambah3.setOnClickListener(this);
    }

    public void plusOrder1(){
        satu +=1;
        totalbelanja += 5000;
        jumlah1.setText(satu + " ");
        totalBelanjaan.setText(totalbelanja + " ");


    }

    public void plusOrder2(){
        dua +=1;
        totalbelanja += 4500;
        jumlah2.setText(dua + " ");
        totalBelanjaan.setText(totalbelanja + " ");

    }

    public void plusOrder3(){
        tiga +=1;
        totalbelanja += 17500;
        jumlah3.setText(tiga + " ");
        totalBelanjaan.setText(totalbelanja + " ");

    }

    public void minusOrder1(){
        if(satu > 0){
            satu -=1;
            totalbelanja -= 5000;
            jumlah1.setText(satu + " ");
            totalBelanjaan.setText(totalbelanja + " ");
        }

    }

    public void minusOrder2(){
        if(dua > 0){
            dua -=1;
            totalbelanja -= 4500;
            jumlah2.setText(dua + " ");
            totalBelanjaan.setText(totalbelanja + " ");
        }

    }

    public void minusOrder3(){
        if(tiga > 0){
            tiga -=1;
            totalbelanja -= 17500;
            jumlah3.setText(tiga + " ");
            totalBelanjaan.setText(totalbelanja + " ");
        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button4:
                plusOrder1();
                break;
            case R.id.button6:
                plusOrder2();
                break;
            case R.id.button8:
                plusOrder3();
                break;
            case R.id.button3:
                minusOrder1();
                break;
            case R.id.button5:
                minusOrder2();
                break;
            case R.id.button7:
                minusOrder3();
                break;


        }
    }
}

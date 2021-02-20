package com.example.ghicitoare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int nrRandom;

    public void generareRand(){
        Random rand=new Random();
        nrRandom=rand.nextInt(20)+1;
    }

    public void onClick(View view){
        EditText editText=(EditText) findViewById(R.id.editText);
        int valoare=Integer.parseInt(editText.getText().toString());

        String mesaj;

        if(valoare > nrRandom){
            mesaj="Mai mic";
        }else if(valoare < nrRandom){
            mesaj="Mai mare";
        }else{
            mesaj="Ai ghicit!";
            generareRand();
        }
        Toast.makeText(this, mesaj, Toast.LENGTH_SHORT).show();
        Log.i("Nr dat", editText.getText().toString());
        Log.i("Nr random", Integer.toString(nrRandom));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
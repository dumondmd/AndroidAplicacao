package com.example.root.androidaplicacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clique(View view){
        Toast.makeText(this, "o botão gerar número foi pressionado", Toast.LENGTH_LONG).show();

        //textView.setTex(editText)=5;
    }
}

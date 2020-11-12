package com.example.saveandrestorestate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnStep;
    private TextView txtNumber;
    private int num=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStep = findViewById(R.id.button_color);
        txtNumber =findViewById(R.id.textView_Number);

        btnStep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num++;
                getNumber();
            }
        });

        getNumber();
    }
    public void getNumber(){
        txtNumber.setText("So thu : "+num);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e("TAG","on restore");
        num=savedInstanceState.getInt("step");
        getNumber();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("step",num);
        Log.e("TAG","on save");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("TAG","on start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("TAG","on stop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("TAG","on pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("TAG","on resume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("TAG","on destroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("TAG","on restart");
    }
}
package com.example.activitylifecyclemonitor2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity1 extends AppCompatActivity {
    public Button start2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        Log.d("Status:","Activity1:onCreate");
        start2=findViewById(R.id.open2);
        start2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenActivityTwo();
            }
        });
    }public void OpenActivityTwo(){
        Intent intent=new Intent(this, Activity2.class);
        startActivity(intent);
    }
    @Override
    protected  void onRestart(){
        super.onRestart();
        Log.d("Status:","Activity1:onRestart");
    }
    @Override
    protected  void onResume(){
        super.onResume();
        Log.d("Status:","Activity:onResume");
    }
    @Override
    protected  void onPause(){
        super.onPause();
        Log.d("Status:","Activity1:onPause");
    }
    @Override
    protected  void onStop(){
        super.onStop();
        Log.d("Status:","Activity1:onStop");
    }
    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Log.d("Status:","Activity1:onDestroy");
    }
}
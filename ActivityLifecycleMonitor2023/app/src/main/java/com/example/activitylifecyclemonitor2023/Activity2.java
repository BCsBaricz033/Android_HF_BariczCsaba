package com.example.activitylifecyclemonitor2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    public Button start3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Log.d("Status:","Activity2:onCreate");
        start3=findViewById(R.id.open3);
        start3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenActivity3();
            }
        });
    }
    public void OpenActivity3(){
        Intent intent=new Intent(this, Activity3.class);
        startActivity(intent);
    }
    @Override
    protected  void onRestart(){
        super.onRestart();
        Log.d("Status:","Activity2:onRestart");
    }
    @Override
    protected  void onResume(){
        super.onResume();
        Log.d("Status:","Activity2:onResume");
    }
    @Override
    protected  void onPause(){
        super.onPause();
        Log.d("Status:","Activity2:onPause");
    }
    @Override
    protected  void onStop(){
        super.onStop();
        Log.d("Status:","Activity2:onStop");
    }
    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Log.d("Status:","Activity2:onDestroy");
    }

}
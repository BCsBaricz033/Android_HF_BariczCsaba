package com.example.activitylifecyclemonitor2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
    public TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Log.d("Status:","Activity3:onCreate");
        textView=findViewById(R.id.textView3);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChangeText();
            }
        });
    }
    public void ChangeText(){
        textView.setText("Changed Text");
    }
    @Override
    protected  void onRestart(){
        super.onRestart();
        Log.d("Status:","Activity3:onRestart");
    }
    @Override
    protected  void onResume(){
        super.onResume();
        Log.d("Status:","Activity3:onResume");
    }
    @Override
    protected  void onPause(){
        super.onPause();
        Log.d("Status:","Activity3:onPause");
    }
    @Override
    protected  void onStop(){
        super.onStop();
        Log.d("Status:","Activity3:onStop");
    }
    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Log.d("Status:","Activity3:onDestroy");
    }
}
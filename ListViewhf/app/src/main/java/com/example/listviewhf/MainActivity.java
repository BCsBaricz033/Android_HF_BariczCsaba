package com.example.listviewhf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Item> list=new ArrayList<Item>(Arrays.asList(new Item("EUR","Euro","4.46 RON","5.56 RON"),
            new Item("USD","Amerikai dollár","3.91 RON","4.1 RON"),
            new Item("CHF","Svájci frank","4.23 RON","4.33 RON"),
            new Item("HUF","Forint","0.0136 RON","0.0146 RON")));
    //String [] list={"EUR","USD","CHF","HUF"};
    ListView listView;
    int flagImages []={R.drawable.eu,R.drawable.usa,R.drawable.svajc,R.drawable.magyar};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView) findViewById(R.id.listView);
        CustomBaseAdapter customBaseAdapter=new CustomBaseAdapter(getApplicationContext(),list,flagImages);
        listView.setAdapter(customBaseAdapter);
    }
}
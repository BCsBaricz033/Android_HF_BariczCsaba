package com.example.listviewdeletetemplab5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {
    ListView myList;
    ArrayList<String> listItems=new ArrayList<>();
    ArrayAdapter<String> adapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myList=findViewById(R.id.myListView);

        listItems.addAll(Arrays.asList(getResources().getStringArray(R.array.listItems)));
        adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,listItems);
        myList.setAdapter(adapter);
        registerForContextMenu(myList); // a context menü hozzáadása a listához
        
        

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu,menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.sort)
        {
            Collections.sort(listItems, new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {

                    return s1.compareTo(s2);
                }
            });
            adapter.notifyDataSetChanged();

        } else if (id==R.id.delete) {
            listItems.clear();
            adapter.notifyDataSetChanged();
        }
        return true;
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo info=(AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
        int id=item.getItemId();

        if(id==R.id.piros){
            ((TextView)myList.getChildAt(info.position)).setTextColor(Color.RED);

            adapter.notifyDataSetChanged();
        } else if (id==R.id.zold) {
            ((TextView)myList.getChildAt(info.position)).setTextColor(Color.GREEN);
            adapter.notifyDataSetChanged();
        }else if (id==R.id.sarga) {
            ((TextView)myList.getChildAt(info.position)).setTextColor(Color.YELLOW);
            adapter.notifyDataSetChanged();
        }
        return true;
    }
}
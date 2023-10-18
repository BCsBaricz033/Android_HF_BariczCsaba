package com.example.tablelayout2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText code=findViewById(R.id.code);
    EditText name=findViewById(R.id.name);
    EditText price=findViewById(R.id.price);
    Button add=findViewById(R.id.add);
    Button cancel=findViewById(R.id.cancel);
    Button show=findViewById(R.id.show);
    TextView result=findViewById(R.id.result);
    List<Product> productList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                productList.add(new Product(code.getText().toString(),name.getText().toString(),Double.parseDouble(price.getText().toString())));

            }
        });
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder resultStringBuilder = new StringBuilder();
                for (Object item : productList) {
                    resultStringBuilder.append(item.toString()).append("\n");
                }
                result.setText(resultStringBuilder.toString());

            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code.setText("");
                name.setText("");
                price.setText("");
            }
        });
    }
}
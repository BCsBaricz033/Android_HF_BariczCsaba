package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button osszeado,kivono,szorzo,oszto;
    EditText bejovo1,bejovo2;
    TextView textView;
    double szam1,szam2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        osszeado=findViewById(R.id.hozzaad);
        kivono=findViewById(R.id.kivon);
        szorzo=findViewById(R.id.szoroz);
        oszto=findViewById(R.id.oszt);
        bejovo1=findViewById(R.id.elsoSzam);
        bejovo2=findViewById(R.id.masodikSzam);
        textView=findViewById(R.id.eredmeny);
        osszeado.setOnClickListener(this);
        kivono.setOnClickListener(this);
        szorzo.setOnClickListener(this);
        oszto.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(bejovo1.getText().toString().equals("")){
            Toast.makeText(this,"Kérek egy számot",Toast.LENGTH_SHORT).show();
            szam1=0;

        } else if (bejovo2.getText().toString().equals("")) {
            Toast.makeText(this,"Kérek egy számot",Toast.LENGTH_SHORT).show();
            szam2=0;
        }
        else{
            szam1=Double.parseDouble(bejovo1.getText().toString());
            szam2=Double.parseDouble(bejovo2.getText().toString());
            if (view.getId() == R.id.hozzaad) {
                textView.setText("Eredmény: " +  (szam1 + szam2));
            }
            else if (view.getId() == R.id.kivon) {
                textView.setText("Eredmény: " +  (szam1 - szam2));
            }
            else if (view.getId() == R.id.szoroz) {
                textView.setText("Eredmény: " +  (szam1 * szam2));
            }else if (view.getId() == R.id.oszt) {
                textView.setText("Eredmény: " +  (szam1 / szam2));
            }

        }

    }
}
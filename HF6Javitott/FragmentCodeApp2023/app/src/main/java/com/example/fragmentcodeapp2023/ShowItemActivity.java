package com.example.fragmentcodeapp2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_2);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }
        //setContentView(R.layout.fragment2);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String selectedItem = extras.getString("rovidites");
            TextView textView = findViewById(R.id.TextView);
            textView.setText( selectedItem);

            String teljes = extras.getString("teljes");
            TextView teljesView = findViewById(R.id.teljes);
            teljesView.setText( teljes);

            String eladasiAr = extras.getString("eladasiAr");
            TextView eladasiArView = findViewById(R.id.eladasiAr);
            eladasiArView.setText( eladasiAr);

            String veteliAr = extras.getString("veteliAr");
            TextView veteliArView = findViewById(R.id.veteliAr);
            veteliArView.setText( veteliAr);

            String eladas = extras.getString("eladas");
            TextView eladasView = findViewById(R.id.eladas);
            eladasView.setText( eladas);

            String vetel = extras.getString("vetel");
            TextView vetelView = findViewById(R.id.vetel);
            vetelView.setText( vetel);

            int image =  extras.getInt("image");
            ImageView img = findViewById(R.id.image);
            img.setImageResource(image);
        }
    }

}
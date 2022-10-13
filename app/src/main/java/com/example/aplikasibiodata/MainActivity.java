package com.example.aplikasibiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView onAlamat;
    ImageView onEmail;
    ImageView onCall;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        onAlamat = findViewById(R.id.onAlamat);
        onEmail = findViewById(R.id.onEmail);
        onCall = findViewById(R.id.onCall);
        
        onAlamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://goo.gl/maps/NKPhdmNfTAZk6ZP89");
            }
        });

        onEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("mailto:sengkuni@gmail.com");
            }
        });

        onCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("tel:081234567890");
            }
        });
    
    
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
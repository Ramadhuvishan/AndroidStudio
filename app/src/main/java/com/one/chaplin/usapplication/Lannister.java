package com.one.chaplin.usapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lannister extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button);
        Button bt = (Button) findViewById(R.id.bman);
        Button bt1 = (Button) findViewById(R.id.hero);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent intent = new Intent(Lannister.this,Lan.class);
              startActivity(intent);
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lannister.this, Lanhero.class);
                startActivity(intent);
            }
        });
    }
}

package com.one.chaplin.usapplication;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.*;

public class Starhero extends AppCompatActivity {
    private RadioGroup rgp, radioGroup;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starhero);

        submit = (Button) findViewById(R.id.button2);
        rgp = (RadioGroup) findViewById(R.id.radio);

        rgp.clearCheck();

        rgp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton rb = (RadioButton) radioGroup.findViewById(i);
            }
        });
        submit.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sid = rgp.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton) findViewById(sid);
                if (sid == -1) {
                    Toast.makeText(Starhero.this, "No hero Selected", Toast.LENGTH_SHORT).show();
                } else {
                    if(rb.getText().equals("NedStark")){
                        Toast.makeText(Starhero.this, rb.getText()+ ": Lord of Winterfell", Toast.LENGTH_SHORT).show();
                    }
                    if(rb.getText().equals("Arya")){
                        Toast.makeText(Starhero.this, rb.getText()+": No one", Toast.LENGTH_SHORT).show();
                    }
                    if(rb.getText().equals("Robb")){
                        Toast.makeText(Starhero.this, rb.getText()+": King in the North", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}
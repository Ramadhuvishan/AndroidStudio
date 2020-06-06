package com.one.chaplin.usapplication;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.*;

public class Lanhero extends AppCompatActivity {
    private RadioGroup rgp, radioGroup;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lanhero);

        submit = (Button) findViewById(R.id.button2);
        rgp = (RadioGroup) findViewById(R.id.radio);

        rgp.clearCheck();

        rgp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton rb = (RadioButton) radioGroup.findViewById(i);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sid = rgp.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton) findViewById(sid);
                if (sid == -1) {
                    Toast.makeText(Lanhero.this, "No hero Selected", Toast.LENGTH_SHORT).show();
                } else {

                    if(rb.getText().equals("Tywin")){
                        Toast.makeText(Lanhero.this, rb.getText()+ ": Lord of Lannisport", Toast.LENGTH_SHORT).show();
                    }
                    if(rb.getText().equals("Jaime")){
                        Toast.makeText(Lanhero.this, rb.getText()+": King Slayer", Toast.LENGTH_SHORT).show();
                    }
                    if(rb.getText().equals("Tyrion")){
                        Toast.makeText(Lanhero.this, rb.getText()+": Hand of the king", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}
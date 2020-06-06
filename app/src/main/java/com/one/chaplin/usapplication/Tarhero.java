package com.one.chaplin.usapplication;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.*;

public class Tarhero extends AppCompatActivity {
    private RadioGroup rgp, radioGroup;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tarhero);

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
                    Toast.makeText(Tarhero.this, "No hero Selected", Toast.LENGTH_SHORT).show();
                } else {

                    if(rb.getText().equals("Aegon")){
                        Toast.makeText(Tarhero.this, rb.getText()+ ": The conqueror", Toast.LENGTH_SHORT).show();
                    }
                    if(rb.getText().equals("Daenerys")){
                        Toast.makeText(Tarhero.this, rb.getText()+": The Queen", Toast.LENGTH_SHORT).show();
                    }
                    if(rb.getText().equals("Viserys")){
                        Toast.makeText(Tarhero.this, rb.getText()+": ElderBrother of Daenerys", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}
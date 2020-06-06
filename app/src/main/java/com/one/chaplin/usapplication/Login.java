package com.one.chaplin.usapplication;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Login extends Activity {
    // User name
    private EditText et_Username;
    // Password
    private EditText et_Password;
    // Sign In
    private  Button bt;
    private MediaPlayer mediaPlayer;
    int c = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        // Initialization
        et_Username = (EditText) findViewById(R.id.username);
        et_Password = (EditText) findViewById(R.id.editText);
        bt = (Button) findViewById(R.id.button);
        Button bte = (Button) findViewById(R.id.ebutton);


        bt.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                // Stores User name
                String username = String.valueOf(et_Username.getText());
                // Stores Password
                String password = String.valueOf(et_Password.getText());
                MediaPlayer mediaPlayer= MediaPlayer.create(Login.this,R.raw.got);


                if (username.equals("Lannister") && password.equals("HearMeRoar")) {
                    mediaPlayer.start();
                    Toast.makeText(getApplicationContext(), "Long live Bran the Broken", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(Login.this,Lannister.class);
                    startActivity(i);
                } else if (username.equals("Stark") && password.equals("WinterIsComing")) {
                    mediaPlayer.start();
                    Toast.makeText(getApplicationContext(), "Long live Bran the Broken", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(Login.this,Stark.class);
                    startActivity(i);
                }  else if (username.equals("Targareyan") && password.equals("FireAndBlood")) {
                    mediaPlayer.start();
                    Toast.makeText(getApplicationContext(), "Long live Bran the Broken", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(Login.this,Targareyan.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "Your House is not yet Registered", Toast.LENGTH_SHORT).show();
                    c--;
                }
                if(c==0){
                    bt.setEnabled(false);
                    Toast.makeText(getBaseContext(), "Careful! You'll be sent to the Wall!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bte.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
        }
    }
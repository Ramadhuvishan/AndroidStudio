package com.one.chaplin.usapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.*;

public class Tar extends AppCompatActivity {
    ListView listView;
    TextView textView;
    String[] listItem;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tar);

        listView = (ListView)findViewById(R.id.list);
        textView = (TextView)findViewById(R.id.tview);
        listItem = getResources().getStringArray(R.array.tarBan);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,listItem);
        listView.setAdapter(adapter);
    }
}

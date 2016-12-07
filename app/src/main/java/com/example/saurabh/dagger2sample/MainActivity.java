package com.example.saurabh.dagger2sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mehclass mehclass= new Mehclass();
        ((Application)getApplication()).getComponent().inject(mehclass);
        boolean injected= mehclass.networkApi != null;
        TextView textView= (TextView) findViewById(R.id.text);
        textView.setText("Dependency injection worked: " + String.valueOf(injected));
    }

    public static class Mehclass{
        @Inject NetworkApi networkApi;
    }

}

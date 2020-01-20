package com.example.clase1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private MessageUtils messageUtils;

    public MessageUtils getMessageUtils() {
        messageUtils = new MessageUtils(this);

        return messageUtils;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        super.onStart();
        getMessageUtils().showMessageLarge("onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        getMessageUtils().showMessageLarge("onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        getMessageUtils().showMessageLarge("onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        getMessageUtils().showMessageLarge("onStop");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        getMessageUtils().showMessageLarge("onRestart");
    }
    @Override
    protected void onDestroy(){
        getMessageUtils().showMessageLarge("onDestroy");
        super.onDestroy();
    }

}

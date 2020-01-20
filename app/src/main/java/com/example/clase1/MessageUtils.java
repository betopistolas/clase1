package com.example.clase1;

import android.content.Context;
import android.widget.Toast;

public class MessageUtils {

    Context context;

    public MessageUtils(Context context){
        this.context = context;
    }

    public void showMessageLarge(String message){
       Toast.makeText(this.context, message,Toast.LENGTH_LONG).show();
    }

    public void showMessageShort(String message){
        Toast.makeText(this.context, message,Toast.LENGTH_SHORT).show();
    }
}

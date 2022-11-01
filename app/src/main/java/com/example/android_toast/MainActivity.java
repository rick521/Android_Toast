package com.example.android_toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        midToast("hello",Toast.LENGTH_LONG,this);
    }

    private void midToast(String str, int showTime, Context mContext)
    {
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.view_toast_custom, (ViewGroup) findViewById(R.id.viewGroup));
        //ImageView img_logo = (ImageView) view.findViewById(R.id.imageView);
        TextView tv_msg = (TextView) view.findViewById(R.id.textView);
        tv_msg.setText(str);
        Toast toast = new Toast(mContext);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(showTime);
        toast.setView(view);
        toast.show();
    }
}
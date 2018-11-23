package com.example.rjw.channel;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.TextureView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SpannableStringBuilder spannable=new SpannableStringBuilder("666");
        Log.d(TAG, "onCreate: "+spannable.length());


        spannable.setSpan(new FakeBoldSpan(),0,3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ((TextView)findViewById(R.id.tv)).setText(FakeBoldUtil.getBlodString("666"));


    }


}

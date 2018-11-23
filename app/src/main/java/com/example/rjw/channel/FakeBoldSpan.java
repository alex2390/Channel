package com.example.rjw.channel;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/**
 * Created by roger on 22/11/2017.
 * 伪粗体，中号字体
 */
public class FakeBoldSpan extends CharacterStyle {
    @Override
    public void updateDrawState(TextPaint tp) {
        tp.setAntiAlias(true);
        tp.setDither(true);
        tp.setStyle(Paint.Style.FILL_AND_STROKE);
        tp.setStrokeWidth(1f); // 控制字体加粗的程度

    }
}

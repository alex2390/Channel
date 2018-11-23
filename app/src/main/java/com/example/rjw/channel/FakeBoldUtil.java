package com.example.rjw.channel;

import android.graphics.Paint;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/**
 * Created by roger on 22/11/2017.
 * 伪粗体，中号字体
 */
public class FakeBoldUtil {
    public static SpannableStringBuilder getBlodString(String string) {
        SpannableStringBuilder spannable = new SpannableStringBuilder(string);
        spannable.setSpan(new FakeBoldSpan(), 0, string.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        return spannable;
        }


}

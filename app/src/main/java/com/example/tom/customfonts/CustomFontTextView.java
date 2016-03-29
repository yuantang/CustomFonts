package com.example.tom.customfonts;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by tom on 2016/3/29.
 */
public class CustomFontTextView extends TextView {
    private static final String TAG = "CustomFontTextView";

    public CustomFontTextView(Context context) {
        super(context);
        CustomFontUtils.applyCustomFont(this,context, null);
    }

    public CustomFontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        CustomFontUtils.applyCustomFont(this,context, attrs);
    }

    public CustomFontTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        CustomFontUtils.applyCustomFont(this,context, attrs);
    }

}
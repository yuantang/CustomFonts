package com.example.tom.customfonts;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by tom on 2016/3/29.
 */
public class CustomFontButtonView extends Button {
    private static final String TAG = "CustomFontTextView";

    public CustomFontButtonView(Context context) {
        super(context);
        CustomFontUtils.applyCustomFont(this,context, null);
    }

    public CustomFontButtonView(Context context, AttributeSet attrs) {
        super(context, attrs);
        CustomFontUtils.applyCustomFont(this,context, attrs);
    }

    public CustomFontButtonView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        CustomFontUtils.applyCustomFont(this,context, attrs);
    }

}
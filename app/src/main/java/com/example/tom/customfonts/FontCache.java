package com.example.tom.customfonts;

import android.content.Context;
import android.graphics.Typeface;

import java.util.HashMap;

/**
 * Created by tom on 2016/3/29.
 */
public class FontCache {
    private static HashMap<String,Typeface> fontCache=new HashMap<>();
    public static Typeface getTypeface(String fontname, Context context){
        Typeface typeface=fontCache.get(fontname);
        if (typeface==null){
            typeface=Typeface.createFromAsset(context.getAssets(),fontname);
            fontCache.put(fontname,typeface);
        }
        return typeface;
    }
}

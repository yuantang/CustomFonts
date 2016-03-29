package com.example.tom.customfonts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Typeface typeface = Typeface.createFromAsset(getAssets(),"RemachineScript_Personal_Use.ttf"); // create a typeface from the raw ttf
//        TextView textView= (TextView) findViewById(R.id.text);
//        Log.i("typeface",typeface.getStyle()+"");
//        textView.setTypeface(typeface);
    }
}

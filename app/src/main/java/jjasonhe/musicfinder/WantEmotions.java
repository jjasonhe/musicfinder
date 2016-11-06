package jjasonhe.musicfinder;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WantEmotions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_want_emotions);

        TextView tv = (TextView) findViewById(R.id.tv);
        Typeface typeface= Typeface.createFromAsset(getAssets(), "fonts/HelveticaNeue.ttf");
        tv.setTypeface(typeface);
    }
}

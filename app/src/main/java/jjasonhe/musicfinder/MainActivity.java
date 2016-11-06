package jjasonhe.musicfinder;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface typeface= Typeface.createFromAsset(getAssets(), "fonts/HelveticaNeue.ttf");
        TextView feel = (TextView) findViewById(R.id.btnFeel);
        feel.setTypeface(typeface);
        TextView want = (TextView) findViewById(R.id.btnWant);
        want.setTypeface(typeface);
    }

    public void clkFeel(View view) {
        Intent intent = new Intent(this, FeelEmotions.class);
        startActivity(intent);
    }

    public void clkWant(View view) {
        Intent intent = new Intent(this, WantEmotions.class);
        startActivity(intent);
    }
}

package jjasonhe.musicfinder;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FeelEmotions extends AppCompatActivity {
    int emotionNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feel_emotions);

        TextView tv = (TextView) findViewById(R.id.tv);
        Typeface typeface= Typeface.createFromAsset(getAssets(), "fonts/HelveticaNeue.ttf");
        tv.setTypeface(typeface);
    }

    public void happy(View view) {
        emotionNum = 1; // Happy
        Intent intent = new Intent(this, CarouselActivity.class);
        intent.putExtra("emotionNum", emotionNum);
        startActivity(intent);
    }
    public void content(View view) {
        emotionNum = 2; // Content
        Intent intent = new Intent(this, CarouselActivity.class);
        intent.putExtra("emotionNum", emotionNum);
        startActivity(intent);
    }
    public void blah(View view) {
        emotionNum = 3; // Blah
        Intent intent = new Intent(this, CarouselActivity.class);
        intent.putExtra("emotionNum", emotionNum);
        startActivity(intent);
    }
    public void angry(View view) {
        emotionNum = 4; // Angry
        Intent intent = new Intent(this, CarouselActivity.class);
        intent.putExtra("emotionNum", emotionNum);
        startActivity(intent);
    }
    public void anxious(View view) {
        emotionNum = 5; // Anxious
        Intent intent = new Intent(this, CarouselActivity.class);
        intent.putExtra("emotionNum", emotionNum);
        startActivity(intent);
    }
    public void shocked(View view) {
        emotionNum = 6; // Shocked
        Intent intent = new Intent(this, CarouselActivity.class);
        intent.putExtra("emotionNum", emotionNum);
        startActivity(intent);
    }
    public void frustrated(View view) {
        emotionNum = 7; // Frustrated
        Intent intent = new Intent(this, CarouselActivity.class);
        intent.putExtra("emotionNum", emotionNum);
        startActivity(intent);
    }
    public void sad(View view) {
        emotionNum = 8; // Sad
        Intent intent = new Intent(this, CarouselActivity.class);
        intent.putExtra("emotionNum", emotionNum);
        startActivity(intent);
    }
    public void love(View view) {
        emotionNum = 9; // Love
        Intent intent = new Intent(this, CarouselActivity.class);
        intent.putExtra("emotionNum", emotionNum);
        startActivity(intent);
    }
}

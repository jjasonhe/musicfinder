package jjasonhe.musicfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FeelEmotions extends AppCompatActivity {
    int emotionNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feel_emotions);
    }

    public void happy(View view) {
        emotionNum = 1;
        Intent intent = new Intent(this, CarouselActivity.class);
        intent.putExtra("emotionNum", emotionNum);
        startActivity(intent);
    }
    public void content(View view) {
        emotionNum = 2;
        Intent intent = new Intent(this, CarouselActivity.class);
        intent.putExtra("emotionNum", emotionNum);
        startActivity(intent);
    }
    public void blah(View view) {
        emotionNum = 3;
        Intent intent = new Intent(this, CarouselActivity.class);
        intent.putExtra("emotionNum", emotionNum);
        startActivity(intent);
    }
    public void angry(View view) {
        emotionNum = 4;
        Intent intent = new Intent(this, CarouselActivity.class);
        intent.putExtra("emotionNum", emotionNum);
        startActivity(intent);
    }
    public void anxious(View view) {
        emotionNum = 5;
        Intent intent = new Intent(this, CarouselActivity.class);
        intent.putExtra("emotionNum", emotionNum);
        startActivity(intent);
    }
    public void shocked(View view) {
        emotionNum = 6;
        Intent intent = new Intent(this, CarouselActivity.class);
        intent.putExtra("emotionNum", emotionNum);
        startActivity(intent);
    }
    public void frustrated(View view) {
        emotionNum = 7;
        Intent intent = new Intent(this, CarouselActivity.class);
        intent.putExtra("emotionNum", emotionNum);
        startActivity(intent);
    }
    public void sad(View view) {
        emotionNum = 8;
        Intent intent = new Intent(this, CarouselActivity.class);
        intent.putExtra("emotionNum", emotionNum);
        startActivity(intent);
    }
    public void love(View view) {
        emotionNum = 9;
        Intent intent = new Intent(this, CarouselActivity.class);
        intent.putExtra("emotionNum", emotionNum);
        startActivity(intent);
    }
}

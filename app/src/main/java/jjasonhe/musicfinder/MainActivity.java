package jjasonhe.musicfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

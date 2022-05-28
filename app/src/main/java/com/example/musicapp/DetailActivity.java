package com.example.musicapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    boolean pause = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Bundle extras1 = getIntent().getExtras();
        if (extras1 != null) {
            int picture = extras1.getInt("ClipPicture", 0);
            String songTitle = extras1.getString("SongTitle", "Music Title");
            String songArtist = extras1.getString("ArtistName", "Artist Name");
            ImageView clipPicture = findViewById(R.id.detail_clip_picture);
            TextView clipTitle = findViewById(R.id.detail_clip_title);
            TextView clipArtist = findViewById(R.id.detail_clip_artist);
            clipPicture.setImageResource(picture);
            clipTitle.setText(songTitle);
            clipArtist.setText(songArtist);
        }
        final ImageView imageView = findViewById(R.id.pause);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pause) {
                    imageView.setImageResource(R.drawable.ic_baseline_play_arrow_24);
                    pause = false;
                } else {
                    imageView.setImageResource(R.drawable.ic_baseline_pause_circle_filled_24);
                    pause = true;
                }
            }
        });
        Button btn = findViewById(R.id.back_to_list);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
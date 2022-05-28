package com.example.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song(R.drawable.ic_baseline_music_note_24, "Lovely", "Billie Eilish"));
        songs.add(new Song(R.drawable.ic_baseline_music_note_24, "Lovely", "Billie Eilish"));
        songs.add(new Song(R.drawable.ic_baseline_music_note_24, "Lovely", "Billie Eilish"));
        songs.add(new Song(R.drawable.ic_baseline_music_note_24, "Lovely", "Billie Eilish"));
        songs.add(new Song(R.drawable.ic_baseline_music_note_24, "Lovely", "Billie Eilish"));
        songs.add(new Song(R.drawable.ic_baseline_music_note_24, "Lovely", "Billie Eilish"));
        songs.add(new Song(R.drawable.ic_baseline_music_note_24, "Lovely", "Billie Eilish"));
        songs.add(new Song(R.drawable.ic_baseline_music_note_24, "Lovely", "Billie Eilish"));
        songs.add(new Song(R.drawable.ic_baseline_music_note_24, "Lovely", "Billie Eilish"));
        songs.add(new Song(R.drawable.ic_baseline_music_note_24, "Lovely", "Billie Eilish"));
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(new SongsAdapter(this, songs));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this, DetailActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("ClipPicture", songs.get(position).getClip_Picture());
                extras.putString("SongTitle", songs.get(position).getSong_Title());
                extras.putString("ArtistName", songs.get(position).getArtist_name());
                i.putExtras(extras);
                startActivity(i);
            }
        });
        Button forward = findViewById(R.id.to_detail_activity);
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, DetailActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("ClipPicture", songs.get(0).getClip_Picture());
                extras.putString("SongTitle", songs.get(0).getSong_Title());
                extras.putString("ArtistName", songs.get(0).getArtist_name());
                i.putExtras(extras);
                startActivity(i);
            }
        });
    }
}
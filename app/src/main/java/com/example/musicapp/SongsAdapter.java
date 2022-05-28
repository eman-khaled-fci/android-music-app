package com.example.musicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<Song> {
    public SongsAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Song song = getItem(position);
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        TextView SongTitle = (TextView) listItem.findViewById(R.id.song_title);
        SongTitle.setText(song.getSong_Title());
        TextView artist = (TextView) listItem.findViewById(R.id.song_artist);
        artist.setText(song.getArtist_name());
        ImageView imageView = (ImageView) listItem.findViewById(R.id.clip_picture);
        imageView.setImageResource(song.getClip_Picture());
        return listItem;
    }
}

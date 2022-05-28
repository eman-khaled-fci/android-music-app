package com.example.musicapp;

public class Song {
    private int clip_Picture = 0;
    private String Song_Title;
    private String artist_name;

    public Song(int clip_Picture, String song_Title, String artist_name) {
        this.clip_Picture = clip_Picture;
        Song_Title = song_Title;
        this.artist_name = artist_name;
    }

    public int getClip_Picture() {
        return clip_Picture;
    }

    public String getSong_Title() {
        return Song_Title;
    }

    public String getArtist_name() {
        return artist_name;
    }
}

package com.iphone.features.music;

public class ConcreteMusicPlayer implements MusicPlayer {
    private String currentTrack;

    @Override
    public void play(){
        System.out.println("Playing music: " + currentTrack);
    }

    @Override
    public void pause(){
        System.out.println("Music paused.");
    }

    @Override
    public void nextTrack(){
        System.out.println("Next track.");
    }

    @Override
    public void previousTrack(){
        System.out.println("Previous track.");
    }
}

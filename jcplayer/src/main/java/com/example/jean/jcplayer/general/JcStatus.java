package com.example.jean.jcplayer.general;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.example.jean.jcplayer.model.JcAudio;

/**
 * Created by rio on 02 January 2017.
 */
public class JcStatus {
    @Nullable
    private JcAudio jcAudio;
    private ImageView imageView;
    private long duration;
    private long currentPosition;
    private PlayState playState;

    public JcStatus() {
        this(null, 0, 0, PlayState.PREPARING,null);
    }

    public JcStatus(JcAudio jcAudio, long duration, long currentPosition, PlayState playState,ImageView imageView) {
        this.jcAudio = jcAudio;
        this.duration = duration;
        this.currentPosition = currentPosition;
        this.playState = playState;
        this.imageView = imageView;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public JcAudio getJcAudio() {
        return jcAudio;
    }

    public void setJcAudio(JcAudio jcAudio) {
        this.jcAudio = jcAudio;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public long getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(long currentPosition) {
        this.currentPosition = currentPosition;
    }

    public PlayState getPlayState() {
        return playState;
    }

    public void setPlayState(PlayState playState) {
        this.playState = playState;
    }

    public enum PlayState {
        PLAY, PAUSE, STOP, CONTINUE, PREPARING, PLAYING
    }
}

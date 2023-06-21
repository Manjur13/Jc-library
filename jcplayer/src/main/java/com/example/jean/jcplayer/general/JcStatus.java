package com.example.jean.jcplayer.general;

import android.graphics.Bitmap;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.jean.jcplayer.R;
import com.example.jean.jcplayer.model.JcAudio;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by rio on 02 January 2017.
 */
public class JcStatus {
    @Nullable
    private JcAudio jcAudio;

    private long duration;
    private long currentPosition;
    private PlayState playState;
    private CircleImageView circleImageView;
    public JcStatus() {
        this(null, 0, 0, PlayState.PREPARING,null);
    }

    public JcStatus(JcAudio jcAudio, long duration, long currentPosition, PlayState playState,CircleImageView circleImageView) {
        this.jcAudio = jcAudio;
        this.duration = duration;
        this.currentPosition = currentPosition;
        this.playState = playState;
        this.circleImageView = circleImageView;
    }

    public CircleImageView getCircleImageView() {
        return circleImageView;
    }

    public void setCircleImageView(CircleImageView circleImageView) {
        this.circleImageView = circleImageView;
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
    public void setSingerImage(String imageUrl) {
        Glide.with(circleImageView.getContext())
                .load(imageUrl)
                .apply(RequestOptions.circleCropTransform())
                .placeholder(R.drawable.baseline_downloading_24) // Placeholder image in case the URL is null or loading fails
                .into(circleImageView);
    }
}

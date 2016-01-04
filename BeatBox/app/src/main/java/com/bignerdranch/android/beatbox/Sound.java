package com.bignerdranch.android.beatbox;

/**
 * Created by zafer on 3.01.16.
 */
public class Sound {

    private String mAssetPath;
    private String mName;
    private Integer mSoundId;

    public String getAssetPath() {
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }

    public Integer getSoundId() {
        return mSoundId;
    }

    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }

    public Sound(String assetPath) {
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String fileName = components[components.length - 1];
        mName = fileName.replace(".wav", " ");
    }
}

package com.example.android.miwok;

/**
 * Created by fernandofischer on 26/04/17.
 */

public class Word {

    private String miwokWord;
    private String defaultWord;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private int audioResouceId = NO_AUDIO_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private static final int NO_AUDIO_PROVIDED = -1;

    public Word(String defaultWord, String miwokWord, int audioResouceId)
    {
        this.miwokWord = miwokWord;
        this.defaultWord = defaultWord;
        this.audioResouceId = audioResouceId;
    }

    public Word(String defaultWord,String miwokWord, int imageResourceId, int audioResouceId)
    {
        this.miwokWord = miwokWord;
        this.defaultWord = defaultWord;
        this.imageResourceId = imageResourceId;
        this.audioResouceId = audioResouceId;
    }

    public void setMiwokWord(String miwokWord) {
        this.miwokWord = miwokWord;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public void setDefaultWord(String defaultWord) {
        this.defaultWord = defaultWord;
    }

    public String getDefaultWord() {
        return defaultWord;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public boolean hasImage(){
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResouceId(){
        return audioResouceId;
    }

    public void setAudioResouceId(int audioResouceId){
        this.audioResouceId = audioResouceId;
    }

    public boolean hasAudioResourseId(){
        return audioResouceId != NO_AUDIO_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "miwokWord='" + miwokWord + '\'' +
                ", defaultWord='" + defaultWord + '\'' +
                ", imageResourceId=" + imageResourceId +
                ", audioResouceId=" + audioResouceId +
                '}';
    }
}

package com.example.android.miwok;

/**
 * Created by fernandofischer on 26/04/17.
 */

public class Word {

    private String miwokWord;
    private String defaultWord;

    public Word(String defaultWord, String miwokWord)
    {
        this.miwokWord = miwokWord;
        this.defaultWord = defaultWord;
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
}

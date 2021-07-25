package com.example.miwok;

public class Word {

    private final String mDefaultTranslation;
    private final String marathiTranslation;
    private int mImageResource = NO_IMAGE_PROVIDED;
    private final int mAudioResource;

    public static final  int NO_IMAGE_PROVIDED = -1;

    public Word(String Default, String marathi, int audio) {
        mDefaultTranslation = Default;
        marathiTranslation = marathi;
        mAudioResource = audio;
    }
    public Word(String Default, String marathi, int image, int audio) {
        mDefaultTranslation = Default;
        marathiTranslation = marathi;
        mImageResource = image;
        mAudioResource = audio;
    }

    public String getMarathiTranslation() {
        return marathiTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getmImageResource(){ return mImageResource;}

    public int getmAudioResource(){ return mAudioResource;}

    public boolean hasImage(){
        return mImageResource != NO_IMAGE_PROVIDED;
    }
}

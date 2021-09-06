package com.example.miwok;

public class Word {

    private String mDefaultTranslation;


    private String mMiwokTranslation;

    private int mresource_id = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;


    public Word(String defaultTranslation, String miwokTranslation, int resource_id, int AudioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mresource_id = resource_id;
        mAudioResourceId = AudioResourceId;
    }
    public Word(String defaultTranslation, String miwokTranslation, int AudioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = AudioResourceId;
    }


    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }


    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getResource_id(){
        return  mresource_id;
    }


    public boolean has_image(){
        return (mresource_id!=NO_IMAGE_PROVIDED);
    }


    public int getAudioResourceId(){ return mAudioResourceId;}
}
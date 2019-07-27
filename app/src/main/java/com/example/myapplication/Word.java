package com.example.myapplication;

public class Word {

    static final int NO_IMAGE_PROVIDE = -1;

    private final String mDefaultTranslation;
    private final String mMiwokTranslation;
    private final int mAudioResourcedId;
    private final int mImageResourceId;

    Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourcedId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourcedId = audioResourcedId;
    }

    int getmImageResourceId() {
        return mImageResourceId;
    }

    String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDE;
    }

    int getAudioResourceId() {
        return mAudioResourcedId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mAudioResourcedId=" + mAudioResourcedId +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}

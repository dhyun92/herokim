package com.example.bottomnavi.ui.musicvideo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MusicvideoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MusicvideoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is musicvideo fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
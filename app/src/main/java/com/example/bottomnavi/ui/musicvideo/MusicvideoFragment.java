package com.example.bottomnavi.ui.musicvideo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.bottomnavi.R;

public class MusicvideoFragment extends Fragment {

    private MusicvideoViewModel musicvideoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        musicvideoViewModel =
                ViewModelProviders.of(this).get(MusicvideoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_music, container, false);
        final TextView textView = root.findViewById(R.id.text_musicvideo);
        musicvideoViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
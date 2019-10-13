package com.example.bottomnavi.ui.artist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.bottomnavi.R;

public class ArtistFragment extends Fragment {

    private ArtistViewModel artistViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        artistViewModel =
                ViewModelProviders.of(this).get(ArtistViewModel.class);
        View root = inflater.inflate(R.layout.fragment_artist, container, false);
        final TextView textView = root.findViewById(R.id.text_artist);
        artistViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
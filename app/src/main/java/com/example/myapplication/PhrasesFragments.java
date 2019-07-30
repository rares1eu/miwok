package com.example.myapplication;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PhrasesFragments extends Fragment {

    WordAdaptor mAdapter;

    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Whereare you going?", "minto wuksus", Word.NO_IMAGE_PROVIDE, R.raw.phrase_where_are_you_going));
        words.add(new Word("what is your name", "tinne qyaase'ne", Word.NO_IMAGE_PROVIDE, R.raw.phrase_what_is_your_name));
        words.add(new Word("My name is...", "oyaast...", Word.NO_IMAGE_PROVIDE, R.raw.phrase_my_name_is));
        words.add(new Word("How are you feeling?", "michekses?", Word.NO_IMAGE_PROVIDE, R.raw.phrase_how_are_you_feeling));
        words.add(new Word("I'm feeling good", "kuchi achit", Word.NO_IMAGE_PROVIDE, R.raw.phrase_im_feeling_good));
        words.add(new Word("Are you coming,", "eene'aa?", Word.NO_IMAGE_PROVIDE, R.raw.phrase_are_you_coming));
        words.add(new Word("yes,I'm coming", "fgdgdfgdfg", Word.NO_IMAGE_PROVIDE, R.raw.phrase_yes_im_coming));
        words.add(new Word("I'mcoming", "dasdasfd", Word.NO_IMAGE_PROVIDE, R.raw.phrase_yes_im_coming));
        words.add(new Word("Let's go.", "dasdsfs", Word.NO_IMAGE_PROVIDE, R.raw.phrase_lets_go));
        words.add(new Word("Come here.", "sdasfgfd", Word.NO_IMAGE_PROVIDE, R.raw.phrase_come_here));

        mAdapter = new WordAdaptor(getContext(), words, R.color.category_phrases);

        ListView listView = view.findViewById(R.id.list);
        listView.setAdapter(mAdapter);
        listView.setOnItemClickListener(mAdapter);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mAdapter.stopMusic();
    }

}

package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

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

        WordAdaptor adapter = new WordAdaptor(this, words, R.color.category_phrases);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(adapter);
    }
}


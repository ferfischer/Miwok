package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        /* Usando arraylist of Word */
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add( new Word("Where are you going?","minto wuksus", R.raw.phrase_where_are_you_going ) );
        words.add( new Word("What is your name?","tinnә oyaase'nә", R.raw.phrase_what_is_your_name ) );
        words.add( new Word("My name is...","oyaaset..." , R.raw.phrase_my_name_is) );
        words.add( new Word("How are you feeling?","michәksәs?", R.raw.phrase_how_are_you_feeling ) );
        words.add( new Word("I’m feeling good.","kuchi achit", R.raw.phrase_im_feeling_good ) );
        words.add( new Word("Are you coming?","әәnәs'aa?" , R.raw.phrase_are_you_coming ) );
        words.add( new Word("Yes, I’m coming.","hәә’ әәnәm", R.raw.phrase_yes_im_coming ) );
        words.add( new Word("I’m coming.","әәnәm", R.raw.phrase_im_coming ) );
        words.add( new Word("Let’s go.","yoowutis", R.raw.phrase_lets_go ) );
        words.add( new Word("Come here.","әnni'nem", R.raw.phrase_come_here ) );

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        // Estabelecer um click listener para reproduzir o áudio quando o item da lista é clicado
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Obter {@link Word} objeto em uma posição dada em que o usuário clicou
                Word word = words.get(position);

                Log.v("NumbersActivity", "Current word: " + word);

                // Criar e configurar o {@link MediaPlayer} para o recurso de áudio associado a palavra atual
                mMediaPlayer = MediaPlayer.create(Phrases.this, word.getAudioResouceId());

                // Iniciar o arquivo de áudio
                mMediaPlayer.start();
            }
        });

        listView.setAdapter(adapter);
    }
}

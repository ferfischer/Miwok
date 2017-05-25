package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        /* Usando arraylist of Word */
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add( new Word("red","weṭeṭṭi",R.drawable.color_red, R.raw.color_red) );
        words.add( new Word("green","chokokki",R.drawable.color_green, R.raw.color_green) );
        words.add( new Word("brown","ṭakaakki",R.drawable.color_brown, R.raw.color_brown) );
        words.add( new Word("gray","ṭopoppi",R.drawable.color_gray, R.raw.color_gray) );
        words.add( new Word("black","kululli",R.drawable.color_black, R.raw.color_black) );
        words.add( new Word("white","kelelli",R.drawable.color_white, R.raw.color_white) );
        words.add( new Word("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow) );
        words.add( new Word("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow) );


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        // Estabelecer um click listener para reproduzir o áudio quando o item da lista é clicado
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Obter {@link Word} objeto em uma posição dada em que o usuário clicou
                Word word = words.get(position);

                Log.v("NumbersActivity", "Current word: " + word);

                // Criar e configurar o {@link MediaPlayer} para o recurso de áudio associado a palavra atual
                mMediaPlayer = MediaPlayer.create(ColorsActivity.this, word.getAudioResouceId());

                // Iniciar o arquivo de áudio
                mMediaPlayer.start();
            }
        });
        listView.setAdapter(adapter);
    }
}

package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        /* Usando array
        String[] words = new String[10];

        words[0] = "one";
        words[1] = "two";
        words[2] = "three";
        words[3] = "four";
        words[4] = "five";
        words[5] = "six";
        words[6] = "seven";
        words[7] = "eight";
        words[8] = "nine";
        words[9] = "ten";

        Log.v("NumbersActivity", "Word at index 0: " + words[0]);
        Log.v("NumbersActivity", "Word at index 1: " + words[1]);
        Log.v("NumbersActivity", "Word at index 2: " + words[2]);
        Log.v("NumbersActivity", "Word at index 3: " + words[3]);
        Log.v("NumbersActivity", "Word at index 4: " + words[4]);
        */

        /* Usando arraylist of Word */
        ArrayList<Word>  words = new ArrayList<Word>();
        words.add( new Word("one","lutti" ) );
        words.add( new Word("two","otiiko" ) );
        words.add( new Word("three","tolookosu" ) );
        words.add( new Word("four","oyyisa" ) );
        words.add( new Word("five","massokka" ) );
        words.add( new Word("six","temmokka" ) );
        words.add( new Word("seven","kenekaku" ) );
        words.add( new Word("eight","kawinta" ) );
        words.add( new Word("nine","wo'e" ) );
        words.add( new Word("ten","na'aacha" ) );

/*       LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);



        for (int i = 0; i < words.size(); i++) {
            
            TextView wordView = new TextView(this);
            wordView.setText(words.get(i));
            rootView.addView(wordView);

        }
*/
        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}

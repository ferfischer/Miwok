package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by fernandofischer on 03/05/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int colorResId;

    public WordAdapter(Context context, List objects, int colorResId) {
        super(context, 0, objects);
        this.colorResId = colorResId;

    }


    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        final Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the miwok word from the current Word object and
        // set this text on the name TextView
        miwokTextView.setText(currentWord.getMiwokWord());

        // Find the TextView in the list_item.xml layout with the ID english_text_view
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english_text_view);
        // Get the english word from the current Word object and
        // set this text on the number TextView
        englishTextView.setText(currentWord.getDefaultWord());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.word_icon);

        if ( currentWord.hasImage() ) {
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        /* Set the background color for the list item */
        View textContainer = (LinearLayout) listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), colorResId);
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;

        //return super.getView(position, convertView, parent);
    }
}

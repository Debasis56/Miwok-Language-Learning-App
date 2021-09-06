 package com.example.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;



public class WordAdapter extends ArrayAdapter<Word>  {

    private int mColorResource;

    public WordAdapter(Context context, ArrayList<Word> words, int colorResource) {
        super(context,0, words);
        mColorResource = colorResource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
                View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

                Word currentWord = getItem(position);


                TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
                        miwokTextView.setText(currentWord.getMiwokTranslation());

                TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
                        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView image = (ImageView)listItemView.findViewById(R.id.image);
        if(currentWord.has_image()) {
            image.setImageResource(currentWord.getResource_id());
            image.setVisibility(View.VISIBLE);
        }
        else
            image.setVisibility(View.GONE);

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResource);
        textContainer.setBackgroundColor(color);




                        return listItemView;
    }
}
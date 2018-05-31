package com.example.android.projectfivetourguideapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link InformationAdapter} is an {@link ArrayAdapter} that can provide the layout for each info item
 * based on a data source, which is a list of {@link Information} objects.
 */
public class InformationAdapter extends ArrayAdapter<Information> {

    /**
     * Resource ID for the background color for this list of words
     */
    private int mColorResourceId;

    /**
     * Create a new {@link InformationAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param information     is the list of {@link Information}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public InformationAdapter(Context context, ArrayList<Information> information, int colorResourceId) {
        super(context, 0, information);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Information currentInformation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID info_text.
        TextView informationTextView = listItemView.findViewById(R.id.info_text);
        // Get the piece of information from the currentWord object and set this text on
        // the information TextView.
        informationTextView.setText(currentInformation.getmInformationId());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = listItemView.findViewById(R.id.info_image);
        // Check if an image is provided for this information fragment or not
        if (currentInformation.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentInformation.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
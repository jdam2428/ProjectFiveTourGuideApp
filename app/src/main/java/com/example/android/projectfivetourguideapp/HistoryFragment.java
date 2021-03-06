package com.example.android.projectfivetourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of attractions.
 */
public class HistoryFragment extends Fragment {


    public HistoryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);

        // Display the information for this fragment
        final ArrayList<Information> information = new ArrayList<Information>();
        information.add(new Information(R.string.history, R.drawable.belgrademain));
        information.add(new Information(R.string.history_two));
        information.add(new Information(R.string.history_three));
        information.add(new Information(R.string.history_four, R.drawable.belgradehistory));

        // Create an {@link InformationAdapter}, whose data source is a list of {@link Information}. The
        // adapter knows how to create list items for each item in the list.
        InformationAdapter adapter = new InformationAdapter(getActivity(), information, R.color.fragment_history);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // info_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link InformationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Information} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
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
public class NightlifeFragment extends Fragment {


    public NightlifeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);

        // Create a list of information for this fragment
        final ArrayList<Information> information = new ArrayList<Information>();
        information.add(new Information(R.string.nightlife, R.drawable.belgradenightlife));
        information.add(new Information(R.string.nightlife_two, R.drawable.nightlife));
        information.add(new Information(R.string.nightlife_three));
        information.add(new Information(R.string.nightlife_four));
        information.add(new Information(R.string.nightlife_five));

        // Create an {@link InformationAdapter}, whose data source is a list of {@link Information}. The
        // adapter knows how to create list items for each item in the list.
        InformationAdapter adapter = new InformationAdapter(getActivity(), information, R.color.fragment_nightlife);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // info_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link InformationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Information} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
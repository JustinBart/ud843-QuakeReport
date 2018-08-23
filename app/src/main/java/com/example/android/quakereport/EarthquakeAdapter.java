package com.example.android.quakereport;

import android.content.Context;
import android.location.Location;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter {

    /**
     * LocationAdapter constructor
     * @param context the context
     * @param locations the location to build
     */
    public EarthquakeAdapter(Context context, ArrayList<Earthquake> locations) {
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // check if the existing view is being reused, otherwise inflate the view
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // get's the location at the given position
        Earthquake currentEarthquake = (Earthquake) getItem(position);

        // get the name TextView and set it to the location's name a the given position
        TextView locationName = convertView.findViewById(R.id.location);
        locationName.setText(currentEarthquake.getLocation());

        // get the address TextView and set it to the location's name a the given position
        TextView earthquakeMag = convertView.findViewById(R.id.mag);
        earthquakeMag.setText(currentEarthquake.getMag().toString());

        // get the hours TextView and set it to the location's name a the given position
        TextView earthquakeDate = convertView.findViewById(R.id.date);
        earthquakeDate.setText(String.valueOf(currentEarthquake.getDate()));

        return convertView;
    }
}

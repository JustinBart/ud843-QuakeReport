package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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

        // get the location TextView and set it to the location offset
        TextView locationOffset = convertView.findViewById(R.id.location);
        locationOffset.setText(getOffsetLocation(currentEarthquake.getLocation()));

        // get the location2 TextView and set it to the primary location's
        TextView primaryLocation = convertView.findViewById(R.id.location2);
        primaryLocation.setText(getPrimaryLocation(currentEarthquake.getLocation()));

        // get the mag TextView and set it to the location's
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        TextView earthquakeMag = convertView.findViewById(R.id.mag);
        earthquakeMag.setText(decimalFormat.format(currentEarthquake.getMag()));

        // Create a new Date object from the time in milliseconds of the earthquake
        Date dateObject = new Date(currentEarthquake.getDate());

        // Find the TextView with view ID date
        TextView dateView = convertView.findViewById(R.id.date);
        // Format the date string (i.e. "Mar 3, 1984")
        String formattedDate = formatDate(dateObject);
        // Display the date of the current earthquake in that TextView
        dateView.setText(formattedDate);

        // Find the TextView with view ID time
        TextView timeView = convertView.findViewById(R.id.time);
        // Format the time string (i.e. "4:30PM")
        String formattedTime = formatTime(dateObject);
        // Display the time of the current earthquake in that TextView
        timeView.setText(formattedTime);

        return convertView;
    }

    private String getOffsetLocation(String text) {
        int index = text.indexOf("of");
        if (index != -1) {
            return text.substring(0, index + 2);
        }
        return "Near the";
    }

    private String getPrimaryLocation(String text) {
        int index = text.indexOf("of");
        if (index != -1) {
            return text.substring(index + 2);
        }
        return text;
    }
    /**
     * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    /**
     * Return the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

}

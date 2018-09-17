package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Earthquake {
    private String mLocation;
    private Double mMag;
    private long mDate;
    private String mUrl;

    /**
     * Create location object with no img
     * @param location name of location
     * @param mag magnitude of the earthquake
     * @param date date of the earthquake
     */
    public Earthquake(String location, Double mag, long date, String url) {
        this.mLocation = location;
        this.mMag = mag;
        this.mDate = date;
        this.mUrl = url;
    }

    /**
     * the url of the earthquake
     * @return String
     */
    public String getUrl() {
        return mUrl;
    }

    /**
     * the name of the location
     * @return String
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * magnitude of the earthquake
     * @return String
     */
    public Double getMag() {
        return mMag;
    }

    /**
     * date of the earthquake in milliseconds
     * @return long
     */
    public long getDate() {
        return mDate;
    }
}

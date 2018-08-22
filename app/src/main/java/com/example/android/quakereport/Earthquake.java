package com.example.android.quakereport;

public class Earthquake {
    private String mLocation;
    private String mMag;
    private String mDate;

    /**
     * Create location object with no img
     * @param location name of location
     * @param mag magnitude of the earthquake
     * @param date date of the earthquake
     */
    public Earthquake(String location, String mag, String date) {
        this.mLocation = location;
        this.mMag = mag;
        this.mDate = date;
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
    public String getMag() {
        return mMag;
    }

    /**
     * date of the earthquake
     * @return String
     */
    public String getDate() {
        return mDate;
    }
}

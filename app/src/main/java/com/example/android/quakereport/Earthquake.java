package com.example.android.quakereport;

public class Earthquake {
    private String mLocation;
    private Double mMag;
    private int mDate;

    /**
     * Create location object with no img
     * @param location name of location
     * @param mag magnitude of the earthquake
     * @param date date of the earthquake
     */
    public Earthquake(String location, Double mag, int date) {
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
    public Double getMag() {
        return mMag;
    }

    /**
     * date of the earthquake
     * @return String
     */
    public int getDate() {
        return mDate;
    }
}

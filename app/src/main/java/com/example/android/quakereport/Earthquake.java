package com.example.android.quakereport;

public class Earthquake {
    private String location;
    private String mag;
    private String date;

    /**
     * Create location object with no img
     * @param nLocation name of location
     * @param nMag magnitude of the earthquake
     * @param nDate date of the earthquake
     */
    public Earthquake(String nLocation, String nMag, String nDate) {
        location = nLocation;
        mag = nMag;
        date = nDate;
    }

    /**
     * the name of the location
     * @return String
     */
    public String getLocation() {
        return location;
    }

    /**
     * magnitude of the earthquake
     * @return String
     */
    public String getMag() {
        return mag;
    }

    /**
     * date of the earthquake
     * @return String
     */
    public String getDate() {
        return date;
    }
}

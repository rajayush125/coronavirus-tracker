package com.ar.coronavirustracker.services.models;

public class LocationStats {
    private String state;
    private String country;
    private int latestTotalCase;
    private int diffFromPrevDay;

    public int getDiffFromPrevDay() {
        return diffFromPrevDay;
    }

    public void setDiffFromPrevDay(int diffFromPrevDay) {
        this.diffFromPrevDay = diffFromPrevDay;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCase() {
        return latestTotalCase;
    }

    public void setLatestTotalCase(int latestTotalCase) {
        this.latestTotalCase = latestTotalCase;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCase=" + latestTotalCase +
                '}';
    }
}

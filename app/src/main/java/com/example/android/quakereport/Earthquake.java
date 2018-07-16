package com.example.android.quakereport;

/**
 * Created by James on 7/11/2018.
 */

public class Earthquake {

    private String magnitude;
    private String mlocation;
    private long mdate;


    public Earthquake(String mag, String mlocations, long date){
        magnitude = mag;
        mlocation = mlocations;
        mdate = date;

    }

    public String getMagnitude()  { return magnitude; }

    public String getLocation() {
        return mlocation;
    }

    public long getDate() {
        return mdate;
    }

    public void setMagnitude(String mag)    {
        magnitude = mag;
    }


    public void setLocation(String loc) { mlocation = loc; }

    public void setDate(long date)    { mdate = date;}

}

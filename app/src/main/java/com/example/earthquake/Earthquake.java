package com.example.earthquake;

public class Earthquake {

     private double mMagnitude;

     private String mLocation;

     private long mDate;

     private String mUrl;

    public Earthquake(double magnitude, String location, long date, String Url){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
        mUrl = Url;
    }

    public double getMagnitude(){

        return mMagnitude;
    }

    public String getLocation(){

        return mLocation;
    }

    public long getDate(){

        return mDate;
    }

    public String getUrl(){
        return mUrl;
    }

}

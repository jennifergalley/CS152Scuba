package com.example.john.divesafe;

/*
*
*	NOTICE - THIS CODE IS NOT TO BE USED FOR REAL DIVING. IT IS A SCHOOL PROJECT ONLY.
*	DO NOT USE THIS APP FOR REAL DIVING. YOUR SAFETY IS NOT GUARANTEED.
*	THIS IS NOT SAFETY CRITICAL SOFTWARE DEVELOPED BY PROFESSIONALS.
*	IT IS AN APP CREATED BY COLLEGE STUDENTS FOR CLASSWORK ONLY.
*
*/

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by john on 4/9/15.
 */
public class Dive implements Parcelable{
    public double depth,bottomTime;
    public boolean isSIT;

    public Dive() {
        depth = 0;
        bottomTime = 0;
        isSIT = false;
    }

    public Dive(Parcel in){
        depth = in.readDouble();
        bottomTime = in.readDouble();
        isSIT = in.readByte() != 0;
    }
    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags){
        dest.writeDouble(depth);
        dest.writeDouble(bottomTime);
        dest.writeByte((byte) (isSIT ? 1 : 0));
    }

    public static final Parcelable.Creator<Dive> CREATOR = new Parcelable.Creator<Dive>()
    {
        public Dive createFromParcel(Parcel in)
        {
            return new Dive(in);
        }
        public Dive[] newArray(int size)
        {
            return new Dive[size];
        }
    };
}
package com.bignerdranch.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Henrik Samuelsson on 2016-06-25.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    private boolean mSolved;

    public Crime() {
        // generate unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getTitle() {
        return mTitle;
    }

    public Date getDate() {
        return mDate;
    }

    private Date mDate;

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}

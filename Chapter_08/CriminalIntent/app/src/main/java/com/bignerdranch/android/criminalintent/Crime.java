package com.bignerdranch.android.criminalintent;

import java.util.UUID;

/**
 * Created by Henrik Samuelsson on 2016-06-25.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime() {
        // generate unique identifier
        mId = UUID.randomUUID();
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
}

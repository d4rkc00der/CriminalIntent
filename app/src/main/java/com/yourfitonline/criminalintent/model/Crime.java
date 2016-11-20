package com.yourfitonline.criminalintent.model;

import java.util.UUID;

/**
 * Created by evgenyshumakov on 20.11.16.
 */

public class Crime {

    private UUID mId;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    private String mTitle;

    public Crime() {
        mId = UUID.randomUUID();
    }
}

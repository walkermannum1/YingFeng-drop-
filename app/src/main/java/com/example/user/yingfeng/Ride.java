package com.example.user.yingfeng;

import java.util.UUID;

/**
 * Created by user on 2016/9/19.
 */
public class Ride {

    private UUID mId;
    private String mTitle;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public UUID getId() {
        return mId;
    }

    public Ride() {
        mId = UUID.randomUUID();
    }
}

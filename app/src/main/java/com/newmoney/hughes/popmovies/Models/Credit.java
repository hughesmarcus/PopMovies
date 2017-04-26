package com.newmoney.hughes.popmovies.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by marcus on 4/26/17.
 */

public class Credit {
    public static final String LOG_TAG = Credit.class.getSimpleName();
    @SerializedName("cast_id")
    private long mId;

    private Credit(){

    }
    public Credit(long id){mId = id;}
    public long getId() {
        return mId;
    }


}

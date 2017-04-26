package com.newmoney.hughes.popmovies.Models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marcus on 4/26/17.
 */

public class Credits {

    @SerializedName("results")
    private List<Credit> credits = new ArrayList<>();

    public List<Credit> getCredits() {
        return credits;
    }
}
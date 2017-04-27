/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.newmoney.hughes.popmovies.network;

/**
 * Created by marcus on 4/25/17.
 */
import com.newmoney.hughes.popmovies.Models.Credits;
import com.newmoney.hughes.popmovies.Models.Movies;
import com.newmoney.hughes.popmovies.Models.Reviews;
import com.newmoney.hughes.popmovies.Models.Trailers;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MovieDatabaseService {

    @GET("3/movie/{sort_by}")
    Call<Movies> discoverMovies(@Path("sort_by") String sortBy, @Query("api_key") String apiKey);

    @GET("3/movie/{id}/videos")
    Call<Trailers> findTrailersById(@Path("id") long movieId, @Query("api_key") String apiKey);

    @GET("3/movie/{id}/reviews")
    Call<Reviews> findReviewsById(@Path("id") long movieId, @Query("api_key") String apiKey);

    @GET("3/movie/{id}/credits")
    Call<Credits> findCreditsById(@Path("id") long movieId, @Query("api_key") String apiKey);

}
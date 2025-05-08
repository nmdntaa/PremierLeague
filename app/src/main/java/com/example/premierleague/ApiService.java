package com.example.premierleague;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("search_all_teams.php")
    Call<TeamResponse> getAllTeams(@Query("l") String league);

    @GET("search_all_teams.php")
    Call<TeamResponse> getTeamsBySportAndCountry(@Query("l") String league);
}

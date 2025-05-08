package com.example.premierleague;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class laLiga extends AppCompatActivity {
    RecyclerView recyclerView;
    ProgressBar progressBar;
    TeamAdapter adapter;
    List<Team> teams = new ArrayList<>();

    //@Override
    //protected void onCreate(Call<TeamResponse>);
}


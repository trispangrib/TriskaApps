package com.example.triskafirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    private RecyclerView rvMovies;
    private ArrayList<Movie> list = new ArrayList<>();
    private String title = "Movies";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvMovies = findViewById(R.id.rv_movies);
        rvMovies.setHasFixedSize(true);

        list.addAll(MoviesData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvMovies.setLayoutManager(new LinearLayoutManager(this));
        ListMovieAdapter listMovieAdapter = new ListMovieAdapter(list);
        rvMovies.setAdapter(listMovieAdapter);

    }

    private void showRecyclerCardView(){
        rvMovies.setLayoutManager(new LinearLayoutManager(this));
        CardViewMovieAdapter cardViewMovieAdapter = new CardViewMovieAdapter(list);
        rvMovies.setAdapter(cardViewMovieAdapter);
    }


    private void showAboutMe(){
        Intent moveIntent = new Intent(MainActivity.this, about.class);
        startActivity(moveIntent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {

            case R.id.action_list:
                title = "List Movie";
                showRecyclerList();
                break;

            case R.id.action_cardview:
                title ="CardView Movie";
                showRecyclerCardView();
                break;

            case R.id.action_aboutview:
                title ="About Me";
                showAboutMe();
                break;
        }
        setActionBarTitle(title);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
    private void showSelectedMovie(Movie hero) {
        Intent intent = new Intent(this, views.class);
        startActivity(intent);
    }


}

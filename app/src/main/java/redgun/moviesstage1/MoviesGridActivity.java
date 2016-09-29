package redgun.moviesstage1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MoviesGridActivity extends AppCompatActivity {

    static String TAG;
    ArrayList<Movies> moviesList;
    GridView movies_gv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_grid);
        TAG = this.getClass().getName();
        getMovies();
        movies_gv = (GridView) findViewById(R.id.movies_gv);
        movies_gv.setAdapter(new MoviesGridAdapter(this, moviesList));

        movies_gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                // Send intent to SingleViewActivity
                Intent i = new Intent(getApplicationContext(), MovieDetailActivity.class);

                // TODO FETCH THE DETAILS OF THIS ITEM AND PASS OVER VIA INTENT
                // TODO USE PARCELABLE
                i.putExtra("id", position);
                startActivity(i);
            }
        });
    }

    private void getMovies() {
        moviesList = new ArrayList<>();
        //Todo fetch movies from online
    }
}

package redgun.moviesstage1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MovieDetailActivity extends AppCompatActivity {

    ImageView movie_poster_iv;
    TextView movie_release_date_tv;
    TextView movie_user_rating_tv;
    TextView movie_title_tv;
    TextView movie_synopsis_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent i = getIntent();
        Movies mi = i.getExtras().getParcelable("parcelMovie");

        ImageView movie_poster_iv = (ImageView) findViewById(R.id.movie_poster_iv);
        TextView movie_release_date_tv = (TextView) findViewById(R.id.movie_release_date_tv);
        TextView movie_user_rating_tv = (TextView) findViewById(R.id.movie_user_rating_tv);
        TextView movie_title_tv = (TextView) findViewById(R.id.movie_title_tv);
        TextView movie_synopsis_tv = (TextView) findViewById(R.id.movie_synopsis_tv);

        Picasso.with(this).load(getResources().getString(R.string.base_image_url).concat(mi.getMoviePoster())).into(movie_poster_iv);
        movie_release_date_tv.setText(mi.getMovieReleaseDate());
        movie_user_rating_tv.setText(mi.getAverageRating() + "");
        movie_title_tv.setText(mi.getMovieTitle());
        movie_synopsis_tv.setText(mi.getMovieOverview());
    }
}

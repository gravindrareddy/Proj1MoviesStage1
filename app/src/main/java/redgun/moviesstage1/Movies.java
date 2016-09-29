package redgun.moviesstage1;

import java.util.Date;

/**
 * Created by gravi on 29-09-2016.
 */
public class Movies {
    String movieTitle;
    int moviePosterPic;
    String moviePlotSynopsis;
    int movieUserRating;
    Date movieReleaseDate;


    Movies(String movieTitle, int moviePosterPic, String moviePlotSynopsis, int movieUserRating, Date movieReleaseDate) {
        this.movieTitle = movieTitle;
        this.moviePosterPic = moviePosterPic;
        this.moviePlotSynopsis = moviePlotSynopsis;
        this.movieUserRating = movieUserRating;
        this.movieReleaseDate = movieReleaseDate;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public int getMoviePosterPic() {
        return moviePosterPic;
    }

    public void setMoviePosterPic(int moviePosterPic) {
        this.moviePosterPic = moviePosterPic;
    }

    public String getMoviePlotSynopsis() {
        return moviePlotSynopsis;
    }

    public void setMoviePlotSynopsis(String moviePlotSynopsis) {
        this.moviePlotSynopsis = moviePlotSynopsis;
    }

    public int getMovieUserRating() {
        return movieUserRating;
    }

    public void setMovieUserRating(int movieUserRating) {
        this.movieUserRating = movieUserRating;
    }

    public Date getMovieReleaseDate() {
        return movieReleaseDate;
    }

    public void setMovieReleaseDate(Date movieReleaseDate) {
        this.movieReleaseDate = movieReleaseDate;
    }
}

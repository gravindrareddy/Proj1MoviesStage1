package redgun.moviesstage1;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by gravi on 29-09-2016.
 */
public class Movies implements Parcelable {
    String title;
    String poster_path;
    String overview;
    double vote_average;
    String release_date;


    Movies(String title, String poster_path, String overview, double vote_average, String release_date) {
        this.title = title;
        this.poster_path = poster_path;
        this.overview = overview;
        this.vote_average = vote_average;
        this.release_date = release_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public double getVote_average() {
        return vote_average;
    }

    public void setVote_average(double vote_average) {
        this.vote_average = vote_average;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    @Override
    public int describeContents() {
        return 0;
    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(poster_path);
        dest.writeString(overview);
        dest.writeDouble(vote_average);
        dest.writeString(release_date);

    }

    // Creator
    public static final Parcelable.Creator CREATOR
            = new Parcelable.Creator() {
        public Movies createFromParcel(Parcel in) {
            return new Movies(in);
        }

        public Movies[] newArray(int size) {
            return new Movies[size];
        }
    };

    // "De-parcel object
    public Movies(Parcel in) {
        title = in.readString();
        poster_path = in.readString();
        overview = in.readString();
        vote_average = in.readDouble();
        release_date = in.readString();
    }


}

package redgun.moviesstage1;

import com.google.android.gms.common.api.Result;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gravi on 09-10-2016.
 */
public class APIResponse {

    @SerializedName("results")
    public ArrayList<Movies> movies;
}

package redgun.moviesstage1;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

/**
 * Created by gravi on 30-09-2016.
 */
public class Utility {
    /**
     * Method to display Toast message
     */
    public static void showToast(Context _context, String value) {
        if (value != null)
            Toast.makeText(_context, value, Toast.LENGTH_LONG).show();
    }

    public static boolean isTopSelected(Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getString(context.getString(R.string.pref_sort_key),
                context.getString(R.string.pref_sort_top))
                .equals(context.getString(R.string.pref_sort_top));
    }
}

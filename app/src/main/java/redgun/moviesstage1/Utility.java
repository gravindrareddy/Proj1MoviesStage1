package redgun.moviesstage1;

import android.content.Context;
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
}

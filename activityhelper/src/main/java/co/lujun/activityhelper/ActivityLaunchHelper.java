package co.lujun.activityhelper;

import android.content.Context;
import android.content.Intent;

/**
 * Author: lujun(http://blog.lujun.co)
 * Date: 18/02/2017 21:39
 */

public class ActivityLaunchHelper {

    public static void startActivityForName(Context context, String name) {
        try {
            Class clazz = Class.forName(name);
            context.startActivity(new Intent(context, clazz));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

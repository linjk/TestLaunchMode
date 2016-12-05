package cn.linjk.testlaunchmode.utils;

import android.app.Activity;
import android.util.Log;

import java.util.Stack;

/**
 * Created by LinJK on 05/12/2016.
 *
 * <p>Class to manage activity stack, base activity
 * can use it.</p>
 *
 * @version 1.0
 */

public class ActivityStackManager {

    /**
     * Single Instance
     * @return
     */
    public static ActivityStackManager getINSTANCE() {
        if (null == INSTANCE) {
            INSTANCE = new ActivityStackManager();
        }
        return INSTANCE;
    }

    //region Add and remove activity
    public void addActivity(Activity ac) {
        if (null == stack_activity) {
            stack_activity = new Stack<>();
        }
        stack_activity.add(ac);

        printAllActivityName();
    }

    public void removeActivity(Activity ac) {
        if (ac != null) {
            stack_activity.remove(ac);
        }

        printAllActivityName();
    }
    //endregion

    //region Print Activity Stack Info

    public void printAllActivityName() {
        for (int i = stack_activity.size()-1; i >= 0; i--) {
            Log.d(TAG, "[" + i + "]Activity Name: " + stack_activity.get(i).getClass().getName());
        }
    }
    //endregion

    ///////////////////////////////////////////////////////////////////////////////

    private ActivityStackManager() {}

    private static final String TAG = ActivityStackManager.class.getSimpleName();

    private static ActivityStackManager INSTANCE;
    private static Stack<Activity> stack_activity;
}

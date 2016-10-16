package com.bijoy.vibhor.flagquiz;

import android.app.Application;

/**
 * Created by vibhor on 10/16/2016.
 */
public class FlagQuiz extends Application {
    public static int totalScore;

    @Override
    public void onCreate(){
        super.onCreate();
        totalScore = 0;
    }
}

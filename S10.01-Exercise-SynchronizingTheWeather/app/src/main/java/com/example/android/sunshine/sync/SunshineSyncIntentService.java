package com.example.android.sunshine.sync;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

// TODO (5) Create a new class called SunshineSyncIntentService that extends IntentService
//  TODO (6) Create a constructor that calls super and passes the name of this class
//  TODO (7) Override onHandleIntent, and within it, call SunshineSyncTask.syncWeather
public class SunshineSyncIntentService extends IntentService {

    public SunshineSyncIntentService() {
        super("SunshineSyncIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        SunshineSyncTask.syncWeather(this);
    }
}

// NOTE: Purpose of IntentService is to run in background. (Even if app is closed ? Advantage over AsyncTaskLoader ?)

// In instructions: "IntentServices are perfect for one off tasks that need to be handled in the background"
// On StackOverflow: "IntentService are more geared towards scheduled tasks (repetitive or not) that
//                    should run on the background, independent of your activity."
package com.simrankaur.divesafe;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;


public class SplashScreen extends Activity {

    /** Duration of wait **/
    int SPLASH_DISPLAY_LENGTH = 4000;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        final ProgressDialog dialog = new ProgressDialog(this);
        dialog.setMessage("Loading...");
        setContentView(R.layout.activity_splash_screen);
        dialog.show();

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                dialog.dismiss();
                finish();
            }
        }, SPLASH_DISPLAY_LENGTH);

    }
}

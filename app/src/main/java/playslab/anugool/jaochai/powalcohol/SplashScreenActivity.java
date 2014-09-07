package playslab.anugool.jaochai.powalcohol;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

public class SplashScreenActivity extends Activity {

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.splashscreen_layout);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(SPLASH_TIME_OUT);
                } catch (Exception e) {

                }
                Intent loginActivity = new Intent(SplashScreenActivity.this, LoginActivity.class);
                startActivity(loginActivity);
                finish();
            }
        }).start();

    }
}

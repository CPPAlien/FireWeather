package cn.hadcn.fireweather;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Application
 * Created by 90Chris on 2016/2/29.
 */
public class FireWeather extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}

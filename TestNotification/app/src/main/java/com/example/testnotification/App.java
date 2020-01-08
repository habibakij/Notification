package com.example.testnotification;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class App extends Application {
    public static final String string1="chennel one";
    public static final String string2="chennel two";

    @Override
    public void onCreate() {
        super.onCreate();

        CreateNotificationChennal();
    }

    public void CreateNotificationChennal(){
        if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.O){
            NotificationChannel channel= new NotificationChannel(
                    string1,"chennal one", NotificationManager.IMPORTANCE_HIGH
            );
            channel.setDescription("this is notification for one");

            NotificationChannel channe2= new NotificationChannel(
                    string2,"chennal two", NotificationManager.IMPORTANCE_LOW
            );
            channe2.setDescription("this is notification for two");
            NotificationManager manager= getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
            manager.createNotificationChannel(channe2);
        }
    }
}

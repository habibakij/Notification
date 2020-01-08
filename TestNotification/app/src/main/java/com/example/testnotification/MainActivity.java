package com.example.testnotification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.testnotification.App.string1;
import static com.example.testnotification.App.string2;

public class MainActivity extends AppCompatActivity {
    EditText editText, editText1;
    Button button, button1;
    NotificationManagerCompat manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText= findViewById(R.id.title);
        editText1= findViewById(R.id.text);
        /*button= findViewById(R.id.button1);
        button1= findViewById(R.id.button2);*/
        manager= NotificationManagerCompat.from(this);

    }

    public void NotificationOne(View view) {
        String s= editText.getText().toString();
        String s1= editText1.getText().toString();
        Notification notification= new NotificationCompat.Builder(this, string1)
                .setSmallIcon(R.drawable.ic_looks_one)
                .setContentTitle(s)
                .setContentText(s1)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();
        manager.notify(1, notification);
    }

    public void NotificationTwo(View view) {
        String s= editText.getText().toString();
        String s1= editText1.getText().toString();
        Notification notification= new NotificationCompat.Builder(this, string2)
                .setSmallIcon(R.drawable.ic_looks_two)
                .setContentTitle(s)
                .setContentText(s1)
                .setPriority(NotificationCompat.PRIORITY_LOW)
                .build();
        manager.notify(2, notification);
    }
}

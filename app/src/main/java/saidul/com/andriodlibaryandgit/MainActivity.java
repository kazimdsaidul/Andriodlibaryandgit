package saidul.com.andriodlibaryandgit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import saidul.com.mylibrary1.MyLIbary1Class;
import saidul.com.mynetworkvolleylibaray.AppController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppController.getInstance();
        MyLIbary1Class.say(getApplicationContext());


    }
}

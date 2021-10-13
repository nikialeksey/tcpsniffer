package com.nikialeksey.tcpsniffer.demo;

import android.app.Activity;
import android.os.Bundle;
import com.nikialeksey.tcpsniffer.NativeLib;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("!!!!!!!!!!!!!!!! " + new NativeLib().stringFromJNI());
    }
}
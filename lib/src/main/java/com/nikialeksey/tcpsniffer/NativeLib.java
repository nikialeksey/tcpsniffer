package com.nikialeksey.tcpsniffer;

public class NativeLib {

    // Used to load the 'tcpsniffer' library on application startup.
    static {
        System.loadLibrary("tcpsniffer");
    }

    /**
     * A native method that is implemented by the 'tcpsniffer' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
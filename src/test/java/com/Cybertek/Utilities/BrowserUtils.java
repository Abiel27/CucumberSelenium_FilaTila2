package com.Cybertek.Utilities;

public class BrowserUtils {
    public static void waits(int second){
    //

    /*
     *waiting for x seconds without handling exception
     * @param second
     */

        try {
        Thread.sleep(second *1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
}


package edu.orangecoastcollege.cs273.fjuarez6.tapcounter;

/**
 * Created by frddy on 9/12/2016.
 */
public class Counter {

    private int mCount;

    public Counter() {
        mCount = 0;
    }

    public void incrementCount()
    {
        mCount += 1;
    }

    public int getCount() {
        return mCount;
    }
}

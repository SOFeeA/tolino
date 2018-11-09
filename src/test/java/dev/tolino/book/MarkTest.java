package dev.tolino.book;

import static junit.framework.Assert.assertEquals;

public class MarkTest extends SuperMarkTest {

    public void setUp() throws Exception {
        mCut = new Mark(mTsNow, mParent );
    }

}
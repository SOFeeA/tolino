package dev.tolino.book;

import junit.framework.TestCase;

import java.time.LocalDateTime;

import static junit.framework.Assert.assertEquals;

public abstract class SuperMarkTest extends TestCase {
    protected Mark mCut;
    LocalDateTime mTsNow = LocalDateTime.now();;

    public void testTs() {
        assertEquals(mTsNow, mCut.mTS);
    }

}

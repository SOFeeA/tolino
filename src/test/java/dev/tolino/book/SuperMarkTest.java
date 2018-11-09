package dev.tolino.book;

import junit.framework.TestCase;

import java.time.LocalDateTime;

import static junit.framework.Assert.assertEquals;

public abstract class SuperMarkTest extends TestCase {
    protected Mark mCut;
    LocalDateTime mTsNow = LocalDateTime.now();;
    protected Page mParent = new Page(111,"abc");

    public void testTsInit() {
        assertEquals(mTsNow, mCut.mTS);
        assertEquals(mParent, mCut.mParent);
    }

    public void testDelete(){
        mParent.mMarks.add(mCut);
        boolean lContains = mParent.mMarks.contains(mCut);
        assertTrue(lContains);
        mCut.delete();
        lContains = mParent.mMarks.contains(mCut);
        assertFalse(lContains);
    }

}

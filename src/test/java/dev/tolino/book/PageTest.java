package dev.tolino.book;

import junit.framework.TestCase;

import java.time.LocalDateTime;

public class PageTest extends TestCase {
    private Page mCut;
    private Mark mMark;

    public void setUp() throws Exception {
        mCut = new Page();
        mMark = new Mark( LocalDateTime.now() );
    }

    public void testSetMark() {
        mCut.setMark(mMark);
        assertTrue(mCut.mMarks.contains(mMark));
    }

    public void testDeleteMark() {
        assertFalse(mCut.mMarks.contains(mMark));
    }
}
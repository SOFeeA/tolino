package dev.tolino.book;

import junit.framework.TestCase;

import java.time.LocalDateTime;

public class PageTest extends TestCase {
    public static final String cLiteral = "abcLiteral";
    public static final int cPageNr = 123;
    private Page mCut;
    private Mark mMark;

    public void setUp() throws Exception {
        mCut = new Page(cPageNr, cLiteral);
        mMark = new Mark( LocalDateTime.now(), mCut);
    }
public void testInit(){
    assertNotNull(mCut.mLiteral);
    assertNotNull(mCut.mPageNr);
}
    public void testSetMark() {
        mCut.setMark(mMark);
        assertTrue(mCut.mMarks.contains(mMark));
    }

    public void testDeleteMark() {
        assertFalse(mCut.mMarks.contains(mMark));
    }
}
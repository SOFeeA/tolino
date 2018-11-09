package dev.tolino.book;

import junit.framework.TestCase;

public class BookTest extends TestCase {

    public static final String cTitle = "Title";
    public static final int cPageNr = 123;
    public static final String cLiteral = "Literal";
    private Book mCut;

    public void setUp() throws Exception {
        mCut = new Book(cTitle);
    }

    public void testAddPage() {
        try {
            mCut.addPage(cPageNr, cLiteral);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            mCut.addPage(cPageNr, cLiteral);
            fail();
        } catch (Exception e) {
        }
    }

    public void testGetPage(){
        try {
            mCut.getPage(cPageNr);
            fail();
        } catch (Exception e) {
        }
        try {
            mCut.addPage(cPageNr, cLiteral);
            Page lActPage = mCut.getPage(cPageNr);
            assertEquals(lActPage.getmPageNr(),cPageNr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
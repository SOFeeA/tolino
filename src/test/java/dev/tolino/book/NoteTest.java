package dev.tolino.book;

import junit.framework.TestCase;

public class NoteTest extends SuperMarkTest {

    private final String cHighlight = "xyzHighlight";

    public void setUp() throws Exception {
        mCut = new Note( mTsNow );
    }
    public void testHighlight(){
        getCut().setHighlight(cHighlight);

        assertEquals(cHighlight,getCut().getmHighlight());
    }

    private Note getCut() {
        return (Note) mCut;
    }
}
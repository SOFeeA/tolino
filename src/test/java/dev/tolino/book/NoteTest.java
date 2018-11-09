package dev.tolino.book;

public class NoteTest extends SuperMarkTest {

    private final String cHighlight = "xyzHighlight";

    public void setUp() throws Exception {
        mCut = new Note( mTsNow, mParent);
    }
    public void testHighlight(){
        getCut().setHighlight(cHighlight);

        assertEquals(cHighlight,getCut().getmHighlight());
    }

    private Note getCut() {
        return (Note) mCut;
    }
}
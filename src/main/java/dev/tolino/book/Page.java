package dev.tolino.book;

import java.util.ArrayList;
import java.util.List;

public class Page {
    String mLiteral;
    int mPageNr;
    List<Mark> mMarks = new ArrayList();

    public String getmLiteral() {
        return mLiteral;
    }

    public void setmLiteral(String mLiteral) {
        this.mLiteral = mLiteral;
    }

    public int getmPageNr() {
        return mPageNr;
    }

    public void setmPageNr(int mPageNr) {
        this.mPageNr = mPageNr;
    }

    public void setMark(Mark pM){
        mMarks.add(pM);
    }
    public void deleteMark(Mark pM){
        mMarks.remove(pM);
    }
}

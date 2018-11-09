package dev.tolino.book;

import java.util.ArrayList;
import java.util.List;

public class Book {
    String mTitle;
    List<Page> mPages = new ArrayList();

    public Book(String pTitle) {
        this.mTitle = pTitle;
    }
    public void addPage(int pPageNr, String pLiteral) throws Exception {
        if (getPageForNr(pPageNr) != null) {
            throw new Exception();
        }
        Page lNewPage = new Page(pPageNr, pLiteral);
        mPages.add(lNewPage);
    }
    public Page getPage(int pPageNr) throws Exception {
        if (getPageForNr(pPageNr) != null) {
            return getPageForNr(pPageNr);
        }
        throw new Exception();
    }

    private Page getPageForNr(int pPageNr) {
        for(Page iP : mPages){
            if(iP.getmPageNr()==pPageNr)return iP;
        }
        return null;
    }
}

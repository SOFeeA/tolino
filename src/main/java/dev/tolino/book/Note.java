package dev.tolino.book;

import java.time.LocalDateTime;

public class Note extends Mark {
    public String getmHighlight() {
        return mHighlight;
    }

    private String mHighlight;
    private String mText;

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public void setHighlight(String mHighlight) {
        this.mHighlight = mHighlight;
    }


    public Note(LocalDateTime pTS) {
        super(pTS);
    }

}

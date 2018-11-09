package dev.tolino.book;

import java.time.LocalDateTime;

public class Mark {
    public LocalDateTime mTS;
    public Page mParent;

    public Mark(LocalDateTime pTS, Page pParent) {
        mTS = pTS;
        mParent = pParent;
    }

    public void delete() {
        mParent.deleteMark(this);
    }
}

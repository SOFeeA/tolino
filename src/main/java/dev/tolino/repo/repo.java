package dev.tolino.repo;

import dev.tolino.book.Book;

import java.util.ArrayList;
import java.util.List;

public class repo {
    List<Book> mBooks = new ArrayList();

    public void addBook(String pTitle){
        mBooks.add(new Book(pTitle));
    }
}

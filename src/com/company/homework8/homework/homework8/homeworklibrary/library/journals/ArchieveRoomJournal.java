package homework.homework8.homeworklibrary.library.journals;

import homework.homework8.homeworklibrary.library.Books;

public class ArchieveRoomJournal {
    private Books[] books;
    private int countAvailinleBooks;

    public ArchieveRoomJournal(int commonBooksAmount) {
        this.books = new Books[commonBooksAmount];
        this.countAvailinleBooks = commonBooksAmount;
    }

    public boolean giveBook(Books book, int bookCard){
        if(books[bookCard] == null) {
            books[bookCard] = book;
            return true;
        }
        return false;
    }

    public int findBook(Books book){
        for (int i = 0; i < books.length; i++) {
            if(books[i].equals(book)){
                return i;
            }
        } return -1;

    }


}

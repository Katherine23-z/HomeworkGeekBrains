package homework.homework8.homeworklibrary.library;

public class Books {
    int bookCard;

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass())return false;
        Books book = (Books) obj;
        return bookCard == book.bookCard;
    }
}

package homework.homework8.homeworklibrary.library;

import homework.homework8.homeworklibrary.Humans.Librarian;
import homework.homework8.homeworklibrary.Humans.Readers.Reader;

public class Library {
    private final ReadingRoom readingRoom;
    private Librarian librarian;

    public Library(ReadingRoom readingRoom) {
        this.readingRoom = readingRoom;
        setLibrarian(librarian);
    }


    public boolean addReader(Reader reader){
        if(librarian.tryGivePlace(reader, readingRoom)){
            readingRoom.increaseNoise(reader);
            return true;
        }
        return false;
    }

    public void removeReader(Reader reader){
       librarian.releasePlace(reader);
       readingRoom.decreaseNoise(reader);
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
        this.librarian.setReadingRoomJournal(readingRoom.getJournal());
    }

    public ReadingRoom getReadingRoom() {
        return readingRoom;
    }
}

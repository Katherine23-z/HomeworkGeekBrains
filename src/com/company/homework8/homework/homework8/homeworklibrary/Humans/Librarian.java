package homework.homework8.homeworklibrary.Humans;

import homework.homework8.homeworklibrary.Humans.Readers.Reader;
import homework.homework8.homeworklibrary.library.ReadingRoom;
import homework.homework8.homeworklibrary.library.journals.ReadingRoomJournal;

import java.util.Random;

public class Librarian {
    private ReadingRoomJournal readingRoomJournal;

    public boolean tryGivePlace(Reader reader, ReadingRoom readingRoom){
        int countAvailiblePlaces = readingRoomJournal.getCountAvailiblePlaces();
        int position = readingRoomJournal.findReaders(reader);
        if(countAvailiblePlaces > 0 && position == -1){
            Random random = new Random(readingRoomJournal.getCommonPlaces(readingRoom));
            while(!readingRoomJournal.givePlace(reader, random.nextInt())){
                return true;
            }

        } return false;
    }
    
    /*public boolean tryGiveBook(Books book, ReadingRoom readingRoom){
        int countAvailiblePlaces = readingRoomJournal.getCountAvailiblePlaces();
        int position = readingRoomJournal.findReaders(reader);
        if(countAvailiblePlaces > 0 && position == -1){
            Random random = new Random(readingRoomJournal.getCommonPlaces(readingRoom));
            while(!readingRoomJournal.givePlace(reader, random.nextInt())){
                return true;
            }

        } return false;
    }*/

    public void releasePlace(Reader reader){
        int position = readingRoomJournal.findReaders(reader);
        readingRoomJournal.releasePlace(position);
    }

    public void setReadingRoomJournal(ReadingRoomJournal readingRoomJournal) {
        this.readingRoomJournal = readingRoomJournal;
    }
}

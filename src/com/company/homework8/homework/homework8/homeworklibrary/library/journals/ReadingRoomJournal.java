package homework.homework8.homeworklibrary.library.journals;

import homework.homework8.homeworklibrary.Humans.Readers.Reader;
import homework.homework8.homeworklibrary.library.ReadingRoom;

public class ReadingRoomJournal {
    private Reader[] readers;
    private int countAvailiblePlaces;


    public ReadingRoomJournal(int commonCountPlaces) {
        this.readers = new Reader[commonCountPlaces];
        this.countAvailiblePlaces = commonCountPlaces;
    }

    public int getCommonPlaces(ReadingRoom readingRoom){
        return readingRoom.getCommonCountPlaces();
    }

    public int getCountAvailiblePlaces() {
        return countAvailiblePlaces;
    }

    public int findReaders(Reader reader){
        for (int i = 0; i < readers.length; i++) {
            if(readers[i].equals(reader)){
                return i;
            }
        } return -1;

    }

    public boolean givePlace(Reader reader, int position){
            if(readers[position] == null) {
                readers[position] = reader;
                return true;
            }
            return false;
    }

    public void releasePlace (int position){
        if(readers[position] != null){
            readers[position] = null;
            countAvailiblePlaces++;
        }
    }


}


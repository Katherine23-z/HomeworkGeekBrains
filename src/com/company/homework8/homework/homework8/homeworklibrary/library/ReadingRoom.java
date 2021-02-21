package homework.homework8.homeworklibrary.library;

import homework.homework8.homeworklibrary.Humans.Readers.Reader;
import homework.homework8.homeworklibrary.library.journals.ReadingRoomJournal;


public class ReadingRoom {
    private final int commonCountPlaces;
    private int noiseValue;
    private ReadingRoomJournal journal;

    public ReadingRoom(int commonCountPlaces, Reader[] readers) {
        this.commonCountPlaces = commonCountPlaces;
        journal = new ReadingRoomJournal(commonCountPlaces);
    }

    public int decreaseNoise(Reader reader){
        return noiseValue += reader.getNoseValue();
    }

    public int increaseNoise(Reader reader){
        return noiseValue -= reader.getNoseValue();
    }

    public ReadingRoomJournal getJournal(){
        return journal;
    }

    public int getCommonCountPlaces() {
        return commonCountPlaces;
    }
}

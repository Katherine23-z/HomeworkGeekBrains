package homework.homework8.homeworklibrary.Humans.Readers;

public class LoudReader extends Reader {
    private final int noiseValue;

    public LoudReader(int readerTicket, int noiseValue) {
        super(readerTicket);
        this.noiseValue = noiseValue;
    }

    @Override
    public int getNoseValue() {
        return this.noiseValue;
    }
}

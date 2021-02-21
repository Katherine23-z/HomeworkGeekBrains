package homework.homework8.homeworklibrary.Humans.Readers;

public class CalmReader extends Reader {
    private final int noiseValue;

    public CalmReader(int readerTicket, int noiseValue) {
        super(readerTicket);
        this.noiseValue = noiseValue;
    }

    @Override
    public int getNoseValue() {
        return this.noiseValue;
    }
}

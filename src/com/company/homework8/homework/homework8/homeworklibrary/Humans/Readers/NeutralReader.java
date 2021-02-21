package homework.homework8.homeworklibrary.Humans.Readers;

public class NeutralReader extends Reader {
    private final int noiseValue;

    public NeutralReader(int readerTicket, int noiseValue) {
        super(readerTicket);
        this.noiseValue = noiseValue;
    }

    @Override
    public int getNoseValue() {
        return this.noiseValue;
    }
}

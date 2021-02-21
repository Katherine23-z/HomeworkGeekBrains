package homework.homework8.homeworklibrary.Humans.Readers;

public abstract class Reader {
    private int readerTicket;

    public Reader(int readerTicket) {
        this.readerTicket = readerTicket;
    }

    public abstract int getNoseValue();

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

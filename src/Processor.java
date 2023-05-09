public class Processor extends Price{

    StampProc stampProc;
    int tact;
    int countCore;

    public Processor(StampProc stampProc, int tact, int countCore, int price){
        super(price);
        this.stampProc = stampProc;
        this.tact = tact;
        this.countCore = countCore;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "device=" + stampProc +
                ", tact=" + tact +
                ", countCore=" + countCore +
                ", price=" + price +
                '}';
    }
}

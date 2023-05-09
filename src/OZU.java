public class OZU extends Price{
    int volumeMemory;

    public OZU(int volumeMemory, int price){
        super(price);
        this.volumeMemory = volumeMemory;
    }

    @Override
    public String toString() {
        return "OZU{" +
                "volumeMemory=" + volumeMemory +
                ", price=" + price +
                '}';
    }
}

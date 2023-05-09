public class PZU extends Price{

    TypeDisc typeDisc;
    int volume;

    public PZU(TypeDisc typeDisc, int volume, int price){
        super(price);
        this.typeDisc = typeDisc;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "PZU{" +
                "typeDisc=" + typeDisc +
                ", volume=" + volume +
                ", price=" + price +
                '}';
    }
}

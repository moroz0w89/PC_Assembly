public class PZU {

    TypeDisc typeDisc;
    int volume;

    public PZU(TypeDisc typeDisc, int volume){
        this.typeDisc = typeDisc;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "PZU{" +
                "typeDisc=" + typeDisc +
                ", volume=" + volume +
                '}';
    }
}

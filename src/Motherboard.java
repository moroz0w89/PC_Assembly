public class Motherboard {
    StampMother stampMother;
    String chipset;

    public Motherboard(StampMother stampMother, String chipset){
        this.stampMother = stampMother;
        this.chipset = chipset;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "stampMother=" + stampMother +
                ", chipset='" + chipset + '\'' +
                '}';
    }
}

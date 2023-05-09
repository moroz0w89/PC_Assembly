import java.util.Objects;

public class Motherboard extends Price{
    StampMother stampMother;
    String chipset;

    public Motherboard(StampMother stampMother, String chipset, int price){
        super(price);
        this.stampMother = stampMother;
        this.chipset = chipset;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "stampMother=" + stampMother +
                ", chipset='" + chipset + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Motherboard that = (Motherboard) o;
        return stampMother == that.stampMother && Objects.equals(chipset, that.chipset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), stampMother, chipset);
    }
}

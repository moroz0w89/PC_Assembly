import java.util.Objects;

public class PcAssebly {

    Motherboard motherboard;
    Processor processor;
    OZU ozu;
    PZU pzu;


    public PcAssebly(Motherboard motherboard, Processor processor, OZU ozu, PZU pzu){
        this.motherboard = motherboard;
        this.processor = processor;
        this.ozu = ozu;
        this.pzu = pzu;
    }

    @Override
    public String toString() {
        return "PcAssebly{" +
                "motherboard=" + motherboard +
                ", processor=" + processor +
                ", ozu=" + ozu +
                ", pzu=" + pzu +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PcAssebly pcAssebly = (PcAssebly) o;
        return Objects.equals(motherboard, pcAssebly.motherboard) && Objects.equals(processor, pcAssebly.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(motherboard, processor);
    }
}

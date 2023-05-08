import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<PcAssebly> PC1 = new ArrayList<>();
        PC1.add(new PcAssebly(
                    new Motherboard(StampMother.Asus, "B450"),
                    new Processor(StampProc.AMD, 5000, 6),
                    new OZU(16),
                    new PZU(TypeDisc.SSD, 512)
        ));

        PC1.forEach(dev ->{
            System.out.println(dev);
        });

    }


}
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<PcAssebly> PC1 = new ArrayList<>();
        PC1.add(new PcAssebly(
                    new Motherboard(StampMother.Asus, "B450", 3000),
                    new Processor(StampProc.AMD, 5000, 6, 7000),
                    new OZU(16, 2500),
                    new PZU(TypeDisc.SSD, 512, 2400)
        ));


        PC1.forEach(dev ->{
            System.out.println(dev);
        });

    }


}
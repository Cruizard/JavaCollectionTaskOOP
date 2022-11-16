import java.util.ArrayList;

public class ManufacLis
{
    public ArrayList<String> CarManufacturer = new ArrayList<>();

    public void addmanuc(String Car)
    {
        CarManufacturer.add(Car);
    }

    public void printcars()
    {
        System.out.println("List :");
        for (String Car : CarManufacturer)
        {
            System.out.println(Car);
        }
    }
}

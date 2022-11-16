import java.util.HashSet;

public class ManufacSet
{
    public HashSet<String> Set = new HashSet<String>();

    public void addmanuc(String Car)
    {
        Set.add(Car);
    }

    public void printcars()
    {
        System.out.println("Set :");
        for (String car : Set)
        {
            System.out.println(car);
        }
    }
}

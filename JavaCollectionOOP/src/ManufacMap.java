import java.util.HashMap;

public class ManufacMap
{
    HashMap<Integer, String> map = new HashMap<Integer, String>();

    public void addmanuc(int Key, String Car)
    {
        map.put(Key, Car);
    }

    public void printcars()
    {
        System.out.println("Map :");
        for (int car : map.keySet())
        {
            System.out.println(map.get(car));
        }
    }
}

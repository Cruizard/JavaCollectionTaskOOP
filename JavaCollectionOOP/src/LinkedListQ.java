import java.util.LinkedList;

public class LinkedListQ
{
    LinkedList<String> linkedListQueue = new LinkedList<String>();

    public void addmanuc(String Car)
    {
        linkedListQueue.add(Car);
    }

    public void printcars()
    {
        System.out.println("LinkedListQueue :");
        for (String car : linkedListQueue)
        {
            System.out.println(car);
        }
    }
}

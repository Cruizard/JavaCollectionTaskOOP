import java.util.LinkedList;

public class LinkedListStac
{
    LinkedList<String> linkedListStack = new LinkedList<String>();

    public void addmanuc(String Car)
    {
        linkedListStack.add(Car);
    }

    public void printcars()
    {
        System.out.println("LinkedListStack :");
        for (String car : linkedListStack)
        {
            System.out.println(car);
        }
    }
}

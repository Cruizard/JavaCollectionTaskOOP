import java.util.*;

public class Task
{
    public static void main(String[] args) {

        System.out.println("VARIABLE METHODS JAVA");
        System.out.println("\n\n");
//      List
        ManufacLis CarManufacturer= new ManufacLis();

        CarManufacturer.addmanuc("Mercedes");
        CarManufacturer.addmanuc("Ferrari");
        CarManufacturer.addmanuc("Lamborghini");
        CarManufacturer.addmanuc("Aston Martin");
        CarManufacturer.printcars();


//      Set
        ManufacSet Set = new ManufacSet();
        Set.addmanuc("Mercedes");
        Set.addmanuc("Ferrari");
        Set.addmanuc("Lamborghini");
        Set.addmanuc("Aston Martin");
        Set.printcars();

//      Map
        ManufacMap map = new ManufacMap();

        map.addmanuc(1, "Mercedes");
        map.addmanuc(2, "Ferrari");
        map.addmanuc(3, "Lamborghini");
        map.addmanuc(4, "Aston Martin");
        map.printcars();

//      LLStack
        LinkedListStac linkedListStack = new LinkedListStac();
        linkedListStack.addmanuc("Mercedes");
        linkedListStack.addmanuc("Ferrari");
        linkedListStack.addmanuc("Lamborghini");
        linkedListStack.addmanuc("Aston Martin");
        linkedListStack.printcars();

//      LLQ
        LinkedListQ linkedListQueue = new LinkedListQ();
        linkedListQueue.addmanuc("Mercedes");
        linkedListQueue.addmanuc("Ferrari");
        linkedListQueue.addmanuc("Lamborghini");
        linkedListQueue.addmanuc("Aston Martin");
        linkedListQueue.printcars();

    }
}

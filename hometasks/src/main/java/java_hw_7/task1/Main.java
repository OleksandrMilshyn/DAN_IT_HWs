package java_hw_7.task1;

public class Main {

    public static void main(String[] args) {
        Warehouse<String> warehouse= new Warehouse<>();
        warehouse.addItem("table");
        warehouse.addItem("chair");
        warehouse.addItem("cabinet");
        System.out.println("Array of items: " + warehouse.viewItems());
        System.out.println("In the warehouse of items: " + warehouse.getItemCount());
        System.out.println("Array of the items before delete: " + warehouse.retrieveAll() + " and it's already empty." );
        System.out.println(warehouse.isEmpty());
        warehouse.clear();
        System.out.println("Array of items: " + warehouse.viewItems());
        System.out.println(warehouse.isEmpty());

    }
}

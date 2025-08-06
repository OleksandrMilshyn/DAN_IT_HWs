package java_hw_7.task1;

import java.util.List;
import java.util.ArrayList;

public class Warehouse<T> {

    private final List<T> itemsWarehouse;

        public Warehouse() {
        this.itemsWarehouse = new ArrayList<>();
    }

    public void addItem(T item){
        itemsWarehouse.add(item);
    }

    public int getItemCount(){
        return itemsWarehouse.size();
    }
    public List<T> retrieveAll(){
        List<T> retrieveItems = new ArrayList<>(itemsWarehouse);
        itemsWarehouse.clear();
        return retrieveItems;
    }
    public List<T> viewItems(){
        return new ArrayList<>(itemsWarehouse);
    }
    public boolean isEmpty(){
        return itemsWarehouse.isEmpty();
    }
    public void clear(){
        itemsWarehouse.clear();
    }
}
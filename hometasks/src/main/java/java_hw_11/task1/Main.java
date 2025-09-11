package java_hw_11.task1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        MyBrowser browser = new MyBrowser();
        MyFile file = new MyFile();

        ArrayList<CanBeClosed> arrayList = new ArrayList<>();
        arrayList.add(browser);
        arrayList.add(file);

        SessionCloser closer = list -> {
            for (CanBeClosed i : list) {
                i.close();
            }
        };

        closer.closeSession(arrayList);
    }
}

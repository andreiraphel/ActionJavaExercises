package array;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Andrei");
        list.add("Raphel");
        list.add("Amang");
        
        Iterator<String> it = list.iterator();
        
        while(it.hasNext()) {
            String name = it.next();
            if (name.equals("Andrei")) {
                it.remove();
            }
        }
        
        for(String x : list) {
            System.out.println(x);
        }
        
        
        
    }

}

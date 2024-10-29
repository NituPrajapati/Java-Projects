import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(3);
        list.add(2);
        System.out.println(list);
//get element will retrun elements index
        int arr = list.get(0);
        System.out.println(arr);

        //Add el in between
        list.add(1,9);
        System.out.println(list);

        //set element
        list.set(4, 8);
        System.out.println(list);

        //delete element give index as argument()
        list.remove(3);
        System.out.println(list);
        
        //sorting
        Collections.sort(list);
        System.out.println(list);
        //size
        int size = list.size();
        System.out.println(size);
    }
    
}

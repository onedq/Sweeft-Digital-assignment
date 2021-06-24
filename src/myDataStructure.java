import java.util.*;
public class myDataStructure{
    ArrayList<Integer> arr;
    HashMap<Integer, Integer>  myMap;

    public myDataStructure() {
        arr = new ArrayList<Integer>();
        myMap = new HashMap<Integer, Integer>();
    }

    void add(int n) {
        if (myMap.get(n) != null) {
            return;
        }
        myMap.put(n, arr.size());
        arr.add(n);
    }

    void remove(int n) {
        Integer num = myMap.get(n);
        if (num == null)
            return;
        myMap.remove(n);
        int cur = arr.size() - 1;
        Integer last = arr.get(cur);
        Collections.swap(arr, num,  cur);
        arr.remove(cur);
        myMap.put(last, num);
    }

    boolean find(int n) {
        if(myMap.get(n) == null) {
            return false;
        }
        return true;
    }

    int getIndex(int n) {
        return myMap.get(n);
    }

    int getElem(int n) {
        return arr.get(n);
    }

}

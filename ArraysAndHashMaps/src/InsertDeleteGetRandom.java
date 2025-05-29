//Problem Link-https://leetcode.com/problems/insert-delete-getrandom-o1/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class InsertDeleteGetRandom {
    HashMap<Integer,Integer> map=new HashMap<>();
    List<Integer> list;
    Random rand;


    public InsertDeleteGetRandom() {
        map=new HashMap<>();
        list=new ArrayList<>();
        rand=new Random();
    }

    public boolean insert(int val) {
        if(!map.containsKey(val)){
            map.put(val,list.size());
            list.add(val);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;

        int idx = map.get(val);
        int last = list.getLast();

        // Swap current with last
        list.set(idx, last);
        map.put(last, idx);

        // Remove last
        list.removeLast();
        map.remove(val);

        return true;
    }

    public int getRandom() {
        int i=rand.nextInt(list.size());
        return list.get(i);
    }
}

/*
@Author Edwin Ortiz Campos
@version 1.0
*/
package Kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Histogram {
    private HashMap<Integer, Integer> histogram;
    
    public Histogram(){
        this.histogram = new HashMap<>();
    }

    public void registerValues(int[] data) {
        for(int key : data){
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
    }
    
    @Override
    public String toString(){
        String result = "";
        Iterator<Map.Entry<Integer, Integer>> iterator = histogram.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, Integer> next = iterator.next();
            result += next.getKey() + "==>" + next.getValue() + "\n";
        }
        return result;
    }
}

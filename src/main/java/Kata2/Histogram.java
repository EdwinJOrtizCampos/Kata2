/*
@Author Edwin Ortiz Campos
@version 1.0
*/
package Kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Histogram {
    private final int[] data;
    
    public Histogram(int[] data){
        this.data = data;
    }

    public Map<Integer, Integer> getHistogram() {
        HashMap<Integer,Integer> histogram = new HashMap<>();
        for(int key : data){
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        return histogram;
    }
    
    
        @Override
    public String toString(){
        String result = "";
        Iterator<Map.Entry<Integer, Integer>> iterator = getHistogram().entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, Integer> next = iterator.next();
            result += next.getKey() + "==>" + next.getValue() + "\n";
        }
        return result;
    }
}

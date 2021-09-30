/*
@Author Edwin Ortiz Campos
@version 1.0
*/

/*
Comentario importante: debido a cómo empecé la kata, creando de antemano
una clase Histogram, para esta versión los cambios son nulos.
*/
package Kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Histogram<T> {
    private final T[] data;
    
    public Histogram(T[] data){
        this.data = data;
    }

    public Map<T, Integer> getHistogram() {
        HashMap<T,Integer> histogram = new HashMap<>();
        for(T key : data){
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        return histogram;
    }
    
    
        @Override
    public String toString(){
        String result = "";
        Iterator<Map.Entry<T, Integer>> iterator = getHistogram().entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<T, Integer> next = iterator.next();
            result += next.getKey() + "==>" + next.getValue() + "\n";
        }
        return result;
    }
}

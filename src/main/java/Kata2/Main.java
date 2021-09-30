/*
@Author Edwin Ortiz Campos
@version 1.0
*/
   
package Kata2;

public class Main {
    public static void main(String[] args){
        Integer[] data = {1,2,4,3,7,2,5,8,4,8,3,7,2,8,1};
        Histogram histo = new Histogram(data);
        System.out.println(histo.toString());
    }
}
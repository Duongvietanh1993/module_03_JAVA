package minElements;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class MinElements {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 2, 4, 1, 5, 2, 3, 4, 1};
        System.out.println("mảng ban đầu là: "+ Arrays.toString(arr));
        TreeMap<Integer,Integer> elementMap = new TreeMap<>();
        for (int element : arr) {
            elementMap.put(element,0);
        }
        //giá trị nhỏ nhất
        Map.Entry<Integer, Integer> firstElements = elementMap.firstEntry();
        System.out.println("giá trị nhỏ nhất: "+firstElements.getKey());
    }
}

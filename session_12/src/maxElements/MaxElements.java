package maxElements;

import java.util.Arrays;
import java.util.TreeMap;

public class MaxElements {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 2, 4, 1, 5, 2, 3, 4, 1};

        System.out.println("mảng ban đầu là: "+ Arrays.toString(arr));
        TreeMap<Integer,Integer>elementMap=new TreeMap<>();
        for (int element: arr) {
            elementMap.put(element,0);
        }
        //giá trị lớn nhất
        int lastElement= elementMap.lastKey();
        //xóa phần tử lớn nhất ra khỏi mảng
        elementMap.remove(lastElement);
        //lấy giá trị lớn thứ 2
        int secondLastElement= elementMap.lastKey();

        System.out.println("Phần tử lớn thứ  2 là: "+secondLastElement);
    }
}

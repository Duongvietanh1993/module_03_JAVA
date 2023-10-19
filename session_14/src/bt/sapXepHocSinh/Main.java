package bt.sapXepHocSinh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static List<Student> listStudent = new ArrayList<>();

    public static void main(String[] args) {
        listStudent.add(new Student("Anh", 8));
        listStudent.add(new Student("Tuan", 4));
        listStudent.add(new Student("Minh", 6));

        System.out.println("Mảng gốc ban đầu: " + listStudent);
        bubbleSort();
        System.out.println("Sắp xếp bong bóng: " + listStudent);
    }

    public static void bubbleSort() {
        for (int i = 0; i < listStudent.size() - 1; i++) {
            for (int j = 0; j < listStudent.size() - 1; j++) {
                if (listStudent.get(j).getScore() > listStudent.get(j + 1).getScore()) {
                    Student temp = listStudent.get(j);
                    listStudent.set(j, listStudent.get(j + 1));
                    listStudent.set(j + 1, temp);
                }
            }
        }
    }

    public static void insertionSort() {
        for (int i = 1; i < listStudent.size(); i++) {
            Student key = listStudent.get(i);
            int j = i - 1;

            while (j >= 0 && listStudent.get(j).getScore() > key.getScore()) {
                listStudent.set(j + 1, listStudent.get(j));
                j--;
            }

            listStudent.set(j + 1, key);
        }
    }

    public static void selectionSort() {
        for (int i = 0; i < listStudent.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < listStudent.size(); j++) {
                if (listStudent.get(j).getScore() < listStudent.get(minIndex).getScore()) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                Student temp = listStudent.get(i);
                listStudent.set(i, listStudent.get(minIndex));
                listStudent.set(minIndex, temp);
            }
        }
    }


}

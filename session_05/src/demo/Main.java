package demo;


public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" ");
        stringBuilder.append("java");
        stringBuilder.insert(6,"PHP, ");
        stringBuilder.delete(6,11);
        System.out.println(stringBuilder.toString());
        System.out.println(stringBuilder.reverse().toString());
    }


}

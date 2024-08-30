import java.util.ArrayList;

class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1); // 0
        numbers.add(2); // 1
        numbers.add(3); // 2
        numbers.add(4); // 3 
        numbers.add(5); // 4

        numbers.remove(Integer.valueOf(4));

        System.out.println(numbers.toString());
    }
}
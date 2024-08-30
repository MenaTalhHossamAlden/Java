import java.util.Arrays;

class Array {
    public static void main(String[] args) {
        char vowels[] = {'e', 'u', 'a', 'o', 'i'};

        Arrays.sort(vowels);

        int startingIndex = 1;
        int endingIndex = 4;

        char key = 'b';

        int foundItemIndex = Arrays.binarySearch(vowels, key);

        System.out.println(Arrays.toString(vowels));
        System.out.println(foundItemIndex);


        Arrays.fill(vowels, startingIndex, endingIndex, 'x');
        System.out.println(Arrays.toString(vowels));

        int numbers[] = {1, 2, 3, 4, 5};
        int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);
    
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbers));

        System.out.println(Arrays.equals(numbers, copyOfNumbers));
    }
}
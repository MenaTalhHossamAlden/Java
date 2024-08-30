import java.util.Arrays;

class Array {
    public static void main(String[] args) {
        char vowels[] = {'e', 'u', 'a', 'o', 'i'};

        Arrays.sort(vowels);

        System.out.println(Arrays.toString(vowels));
    }
}
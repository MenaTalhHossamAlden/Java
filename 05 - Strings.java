class Strings {
    public static void main(String[] args) {
         // 2 ways to declare the string
        String name1 = "Menatalh";
        System.out.println(name1);
        String name2 = new String("Menatalh");
        System.out.println(name2);

        String name = "Menatalh";
        String country = "Egypt";
        int age = 24;
        String company = "no one";
        String formattedString = String.format("My name is %s. I am from %s. I am %d years old. I work for %s.", name, country, age, company);
        System.out.println(formattedString);
    }
}
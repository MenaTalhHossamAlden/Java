class Strings {
    public static void main(String[] args) {
         // 2 ways to declare the string
        String name1 = "Menatalh"; 
        System.out.println(name1); 
        String name2 = new String("Menatalh");
        System.out.println(name2);

        String name = "Menatalh"; // %s
        String country = "Egypt"; // %s
        int age = 24; // %d
        String company = "no one";
        double GPA = 3.8; // %f
        char percentSign = '%'; // %c
        boolean amITellingTheTruth = false; // %b

        String formattedString = String.format(
        "My name is %s. I am from %s. I am %d years old. I work for %s.My Gpa is %f. I have attended 100%c of my university classes. These are all %b claims",
         name, country, age, company, GPA, percentSign, amITellingTheTruth);
        
        System.out.println(formattedString); 

        System.out.println(name.length());

        System.out.println(name.isEmpty());

        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println(name.toLowerCase()); 

        String string1 = new String("abc");
        String string2 = new String("ABC");
        System.out.println(string1 == string2);
        System.out.println(string1.equals(string2)); 
        System.out.println(string1.equalsIgnoreCase(string2));

        String string = "The sky is blue";
        System.out.println(string.replace("blue", "red"));
        System.out.println(string);

        System.out.println(string.contains("sky"));
        System.out.println(string.contains("free"));
    }
} 
package Task_Feb25_2025;

import java.util.Arrays;

public class Practice_String_Functions {
    public static void main(String[] args) {
        String str1 = "Akhil"; // Here in this line 5 we are creating a string in SCP (String collection pool)
        String str2 = "Akhil"; // Here in this line 6 we are creating a string in SCP (String collection pool)
        String str3 = new String("Akhil"); // Creates a new object area in heap area when we use new

        System.out.println(str1==str2); // returns true as both are having same string and allocated to same space it will print true.
        System.out.println(str1==str3); // returns false as for st3 space will be allocated in heap area and str1 space is allocated in SCP since both are allocated to different areas it will print false.
        System.out.println(str1.equals(str3)); //Here in this line we are checking if we string value given in str1 and str 3 are same or not


        //Practice
        String str4 = "Akhil";
        String str5 = "Dande";

        //1.CharAt
        System.out.println(str4.charAt(2));
        System.out.println(str5.charAt(2));

        //2.concat
        System.out.println(str4.concat(str5));

        // 3.contains
        System.out.println(str4.contains("Akhil"));
        System.out.println(str5.contains("Dande"));

        // 4.equals
        System.out.println(str4.equals(str5));
        System.out.println(str5.equals(str4));

        // 5.equals Ignore Case
        System.out.println(str4.equalsIgnoreCase("aKhIl"));
        System.out.println(str5.equalsIgnoreCase("dAnDe"));

        //6.Index of
        System.out.println(str4.indexOf('A'));
        System.out.println(str5.indexOf('D'));

        //7.length
        System.out.println(str4.length());
        System.out.println(str5.length());

        //8.replace
        System.out.println(str4.replace('i','I'));
        System.out.println(str5.replace('a','A'));

        //9.Split
        String name = "Akhil Dande";
        String[] split = name.split(" ");
        System.out.println(Arrays.toString(split));
        System.out.println(split[0]);
        System.out.println(split[1]);

        //10.Substring
        System.out.println(name.substring(1,3));

        //11.tolowercase
        System.out.println(name.toLowerCase());

        //12.to uppercase
        System.out.println(name.toUpperCase());

        //13.replace all
        System.out.println(name.replaceAll(" ", " Sai Akhil "));

        //14. Starts with
        System.out.println(name.startsWith("A"));

        //15.Ends with
        System.out.println(name.endsWith("e"));

        //16. isEmpty
        System.out.println(name.isEmpty());

        //17. trim
        String str7 =  "   World   ";
        System.out.println(str7.trim());

        //18.compareTo
        System.out.println(name.compareTo("World"));

        //19.last Index
        System.out.println(name.lastIndexOf('a'));

        //20.repeat
        String str8 = "repeat";
        System.out.println(str8.repeat(3));

        StringBuilder sb = new StringBuilder("Hello");
        sb.append("Good Morning!");
        System.out.println(sb.toString());

        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1+s2;
        System.out.println(s3);
        System.out.println(s2);
        System.out.println(s1);
    }
}

package ru.gb.jseminar;

public class Task0 {

//     Даны следующие строки, cравнить их с помощью == и метода equals()

    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = "Hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1.equalsIgnoreCase(s2)); // !!! Оъекты всегда сравниваются через equals, а примитвы через ==
        System.out.println(s1 == s4);
    }

}

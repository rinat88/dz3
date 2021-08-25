package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Bill", "Tom", "Bob","Ali"};

        for (int i = 0; i < names.length; i++) {
            switch (names[i]) {
                case "Bill":
                    System.out.println("good morning " + names[i]);
                    break;
                case "Tom" :
                    System.out.println("good day " + names[i]);
                    break;
                case "Bob" :
                    System.out.println("hello everyone " + names[i]);
                    break;
                case "Ali" :
                    System.out.println("Hi " + "Ali");


            }


        }
    }
}

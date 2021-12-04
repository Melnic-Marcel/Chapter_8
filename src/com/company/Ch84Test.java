package com.company;

public class Ch84Test {
        public static void main(String[] args){
            Ch84 r1 = new Ch84();

            r1.setLength(2.0f);
            r1.setWidth(8.0f);

            Ch84 r2 = new Ch84(4.0f, 3.0f);

            System.out.println("rect1 default constructor");
            System.out.printf("%s\n", r1.toString());

            System.out.println("rect2 constructed with width and length");
            System.out.printf("%s\n", r2.toString());

            try{
                Ch84 rect3 = new Ch84(40.0f, -1.0f);
            }catch(IllegalArgumentException e){
                System.out.printf("\nException while initialising rect3: %s\n",
                        e.getMessage());
            }
        }
    }
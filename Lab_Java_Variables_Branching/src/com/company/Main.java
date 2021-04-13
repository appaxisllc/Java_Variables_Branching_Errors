package com.company;

public class Main
{

    int num1;

    //      int num5="gold";
// ERROR integers cannot be strings  types: java.lang.String cannot be converted to int

    public int mymethod(){

        int num5=8;

        int _num3=5;

        int num4=(num1+num5+_num3);
        System.out.println(num1);//global variable for int without initialize it gives 0

//      int $num2;
// ERROR java: variable $num2 might not have been initialized
// System.out.println($num2);

        System.out.println(num4);

//        int 9num4;
// ERROR java: not a statement

//branching
        for(int j=0;j<20;j++){
            if(j==7)
            {
                break;
            }
            else if(j==5)
            {
                System.out.println("This is five");
                continue;
            }
            System.out.println(j);
        }
        return 0;
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.mymethod();
    }
}
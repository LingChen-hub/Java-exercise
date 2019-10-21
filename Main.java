package com.lingdecompany;

import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Time timeObject = new Time();
        System.out.println(timeObject.toMilitary()); //default状态
        System.out.println(timeObject.toStandard()); //default状态

        timeObject.setTime(13,27,8);
        System.out.println(timeObject.toMilitary());
        System.out.println(timeObject.toStandard());
    }
}





       /* //计算平均数
        System.out.println("Your average is " + Average(23,45,78,54,23));

    }
    public static double Average(double...numbers){ //...代表N个参数的时候

        double total = 0;

        for(double x:numbers)
            total +=x;
        return total/numbers.length; //numbers.length指个数



       /* //多维数列
        int firstarray [][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int secondarray [][] = {{10}, {20, 21}, {30, 31, 32}, {40, 41, 42, 43}};

        System.out.println("第一个数列");
        displayarray(firstarray);
        System.out.print("\r\n"); //空一行
        System.out.println("第二个数列");
        displayarray(secondarray);
    }
    //用表格形式展示多维数列
    public static void displayarray(int x[][]){
        for(int row = 0; row<x.length; row++){
            for(int column = 0; column<x[row].length; column++){
                System.out.print(x[row][column]+"\t"); //打印第一行, 注意不是println
            }
            System.out.println();//打印第二行etc，要换行，所以用println
        }
    }
}




  /*
        //数列的运算; 将数列里每个元素+5
        int bucky[] = {3, 4, 5, 6, 7};
        change(bucky);
        for (int y : bucky)
            System.out.println(y);
    }

    public static void change(int x[]) {
        for (int counter=0; counter<x.length; counter++)
            x[counter] +=5;
    }





       /*    //以下程序是模拟投骰子100次，1-6出现的频次
        Random randomObject = new Random(); //要用random class先创建对象
        int freq[] = new int[7]; //有7个元素，length为7，指数为0-6

        for(int roll = 1; roll <= 100; roll++){ //投骰子100次
            freq[1+ randomObject.nextInt(6)]++;  //在这里++在前面和在后面没有区别；随机范围是0-5，所以需要+1，变成1-6
        }

        System.out.println("Face\tFrequency");

        for(int face = 1; face < freq.length; face++){
            System.out.println(face + "\t\t" + freq[face]);
        }




       /*   System.out.println("Index\tValue"); // \t是tab的意思，空格； 这里是把数列用表格的形式列出来
        int bucky[] = {2, 33, 43, 56, 72};

        for(int counter = 0; counter < bucky.length; counter++){
            System.out.println(counter+ "\t\t " + bucky[counter]);
        }




          /* Random dice = new Random(); //模拟掷色子
        int number;

        for (int counter = 1; counter <= 10; counter++){
            number = 1 + dice.nextInt(6); //因为从0开始，随机范围是0-5，所以需要+1
            System.out.println(number + " ");
        }



           /* AverageCalculator averageCalculatorObject = new AverageCalculator();
        averageCalculatorObject.AverageCalculator(); //调用算平均数的方法


        /*  tuna tunaObject = new tuna("Lily"); //构造器的存在，使得我们在创建object的时候就可以马上赋值给它
        tuna tunaObject2 = new tuna("Tom");
        tunaObject.saying();
        tunaObject2.saying();

       /*  Scanner input = new Scanner(System.in);
        tuna tunaObject = new tuna("Lily");
        System.out.println("Enter name of first gf here: ");
        String temp = input.nextLine();
        tunaObject.setName(temp);
        tunaObject.saying(); //多个方法的调用

        tuna tunaObject = new tuna(); //类的声明
        tunaObject.simpleMessage("ling"); //调用那个类里面的方法，并给参数赋值

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name here: ");
        String name = input.nextLine(); //参数等于用户输入的东西
        tunaObject.simpleMessage(name);  //调用那个类里面的方法







        //把数列里的元素都列出来
        String[] fruits = {"apple","mango","orange"};

        for (int i = 0; i< fruits.length; i++)
            System.out.println(fruits[i]);

        for(int i = fruits.length - 1; i > 0; i--)
            System.out.println(fruits[i]);

        for(String x : fruits) //这是for each loop; x指代数列里的元素，string是类型，fruits是数列名字
            System.out.println(x); //它只能按原数列的顺序出来，从apple到orange



        //continue & break
        Scanner scanner  = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit"))  {//有了if break语句，也可写成 while(true). 注意如果没有break, 循环会一直下去，内存不够，会死机
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if(input.equals("pass"))
                continue;//回到循环开始
            if(input.equals("quit"))
                break; //break用于马上跳出循环，不会执行接下来的指令，即输出不会有“quit"字节出现。
            // 这里如果删去if和break这个指令，最后一行输出就是“quit”字节。
            System.out.println(input);
        }



       String input = "";
      while (!input.equals("quit"))  {       //while用于不知道循环多少次；这里是用户输入内容，直到输入为quit,循环才会结束
          System.out.print("Input: ");
          Scanner scanner  = new Scanner(System.in);
          input = scanner.next().toLowerCase();
          System.out.println(input);
      }


        do { //do while和while的区别是，do while至少会循环一次，因为条件在最后一句，而while是先读条件，如果不符合，直接就不循环了
            System.out.print("Input: ");
            Scanner scanner  = new Scanner(System.in);
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quite"));




       for(int i = 0; i < 5; i++)      //for用于知道循环多少次
            System.out.println("hallo world " + i);

        int i = 7;
        while (i > 0){
            System.out.println("hello world " + i);
            i--;
        }



        Scanner scanner = new Scanner(System.in); //输入, 第二个小写的scanner是名字
        System.out.print("Number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0) //这种写法相比以下的写法，虽然代码有重复的地方，但是结构更加清晰易读，推荐
            System.out.println("Fizzbuzz");
        else if(number % 5 == 0)
            System.out.println("Fizz");
        else if(number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);


       /*if(number % 5 == 0){
            if(number % 3 == 0)
                System.out.println("Fizzbuzz");
            else
                System.out.println("Fizz");
        }
        else if(number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);


        final float PI = 3.14F;//用了final，PI的值就不可变了，即为常数constant,命名规则为字母全部大写
        int result1 = 10 / 3; //值为整数
        double result2 = (double)10 / (double)3; //值为double

        int x = 1;
        int y = ++x;
        System.out.println("x =" + x);
        System.out.println("++x =" + y); //++x为2，x++为1

        int p =5;
        int q = p++;
        System.out.println("p =" + p);
        System.out.println("p++ =" + q); //p++为5


        double a = 2.1;
        int b = (int)a + 3; //换数据类型
        System.out.println("b =" + b);


        int 随机数 = (int) (Math.random()*100); //因为math.random出来的是0-1之间的数，会有小数，所以用int取整数
        System.out.println("随机数0-100 = " + 随机数);

        String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println("数字变百分比 = " + result);


        System.out.print("Name: ");
        String name = scanner.nextLine().trim(); //trim是去除空格的意思，即输入名字时如果打了很多空格，程序的输出会去掉这些空格
        System.out.println("you are "+ name);


        boolean hasHighIncome = true;
        boolean hasPrettyFace = false;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasPrettyFace) && !hasCriminalRecord;
        System.out.println("相亲合格= "+ isEligible);


        System.out.print("temperature: ");
        float temperature = scanner.nextFloat();
        if (temperature > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water"); //if里面的result有多余一行时，才需要大括号，否则可以省去
        }
        else if (temperature>=20)
            System.out.println("It's a nice day");
        else
            System.out.println("It's cold");


        int income = 120_000;
        String className = (income > 1000) ? "first class" : "economy"; //if 语句的简写
        System.out.println("className = " + className);
        System.out.println(income > 1000 ? "className = first class" : "className = economy");//另一种简写

        String role = "admin";
        switch (role) {            //也可用if
            case "admin":
                System.out.println("You're an admin");
                break;
            case "moderator":
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
                break;
        }*/

   // }
//}

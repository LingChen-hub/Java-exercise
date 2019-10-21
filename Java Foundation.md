### 把数列里的元素都列出来
```
        String[] fruits = {"apple","mango","orange"};

        for (int i = 0; i< fruits.length; i++)
            System.out.println(fruits[i]);

        for(int i = fruits.length - 1; i > 0; i--)
            System.out.println(fruits[i]);

        for(String x : fruits) //这是for each loop; x指代数列里的元素，string是类型，fruits是数列名字
            System.out.println(x); //它只能按原数列的顺序出来，从apple到orange
```
### continue & break
 ```
        Scanner scanner  = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit"))  { //有了if break语句，也可写成 while(true). 注意如果没有break, 循环会一直下去，内存不够，会死机
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if(input.equals("pass"))
                continue;//回到循环开始
            if(input.equals("quit"))
                break; //break用于马上跳出循环，不会执行接下来的指令，即输出不会有“quit"字节出现。
            // 这里如果删去if和break这个指令，最后一行输出就是“quit”字节。
            System.out.println(input);
        }
 ```
### while
``` String input = "";
      while (!input.equals("quit"))  {       //while用于不知道循环多少次；这里是用户输入内容，直到输入为quit,循环才会结束
          System.out.print("Input: ");
          Scanner scanner  = new Scanner(System.in);
          input = scanner.next().toLowerCase();
          System.out.println(input);
      }
```
### do while
```
 do { //do while和while的区别是，do while至少会循环一次，因为条件在最后一句，而while是先读条件，如果不符合，直接就不循环了
            System.out.print("Input: ");
            Scanner scanner  = new Scanner(System.in);
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quite"));
```
### if
#### if 练习:温度
```
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
```
#### if练习：3和5的公约数
```
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

```
```
        if(number % 5 == 0){
            if(number % 3 == 0)
                System.out.println("Fizzbuzz");
            else
                System.out.println("Fizz");
        }
        else if(number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
```     
#### if 的简写
```
        int income = 120_000;
        String className = (income > 1000) ? "first class" : "economy"; //if 语句的简写
        System.out.println("className = " + className);
        System.out.println(income > 1000 ? "className = first class" : "className = economy");//另一种简写
```        
### switch
```
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
        }
```        
### 格式规则
```
        final float PI = 3.14F; //用了final，PI的值就不可变了，即为常数constant,命名规则为字母全部大写
        int result1 = 10 / 3; //值为整数
        double result2 = (double)10 / (double)3; //值为double
        String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println("数字变百分比 = " + result);
```

### ++x & x++
```
        int x = 1;
        int y = ++x;
        System.out.println("x =" + x);
        System.out.println("++x =" + y); //++x为2，x++为1
```
        double a = 2.1;
        int b = (int)a + 3; //换数据类型
        System.out.println("b =" + b);
        
### 随机数
```
        int 随机数 = (int) (Math.random()*100); //因为math.random出来的是0-1之间的数，会有小数，所以用int取整数
        System.out.println("随机数0-100 = " + 随机数);
```         
### trim
```
        System.out.print("Name: ");
        String name = scanner.nextLine().trim(); //trim是去除空格的意思，即输入名字时如果打了很多空格，程序的输出会去掉这些空格
        System.out.println("you are "+ name);
```
### boolean
```
boolean hasHighIncome = true;
        boolean hasPrettyFace = false;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasPrettyFace) && !hasCriminalRecord;
        System.out.println("相亲合格= "+ isEligible);
```

        

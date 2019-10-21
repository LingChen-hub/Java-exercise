package com.lingdecompany;

public class tuna {

    private String girlName; //private指这个值只在tuna类里面调用

    public tuna(String name){ //构造器名字和类必须一样
        girlName  = name;
    }

    public void setName(String name){
        girlName = name; //这里是为了把private变成公共的，在其他类可以调用
    }

    public String getName() { //string 是return的类型，如果是void代表不需要return
        return girlName;
    }

    public void saying(){
        System.out.println("Your first girlfriend was "+ getName());
    }

  /*  public void simpleMessage(String name){
        System.out.println("hello, This is another class " + name);
    }*/


}

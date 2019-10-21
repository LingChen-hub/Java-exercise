package com.lingdecompany;

import java.util.SplittableRandom;

public class Time {
    private int hour = 1;   //private的变量只能被同一class里的method的调用
    private int minute = 2;
    private int second = 3;

   /* private int hour;   //private的变量只能被同一class里的method的调用
    private int minute;
    private int second;*/

    public void setTime(int hour, int minute, int second){
        this.hour = 4;  //如果不用this, hour的值会优先考虑上面我们设定的local private数值1
        this.minute = 5;
        this.second = 6;

       /* hour = ((h>=0 && h<24) ? h : 0);
        minute = ((m>=0 && m<60) ? m : 0);
        second = ((s>=0 && s<60) ? s : 0);*/
    }

    public  String toMilitary(){    //海军时间，即24小时制
        return String.format("%02d:%02d:%02d", hour,minute,second); //"%d" is going to output an integer.
        // %02d is going to output an integer, but it HAS to be 2 DIGITS.
        // so it means if you put in a "1", it is going to show up in the console as "01",用0填充不足的位置
    }
    public String toStandard(){     //标准时间，即12小时制
        return String.format("%d:%02d:%02d %s",(hour==0||hour==12? 12:hour%12), minute, second, (hour < 12? "am": "pm"));
    }

}

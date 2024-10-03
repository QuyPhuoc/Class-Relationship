/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationship;

/**
 *
 * @author DELL
 */
public class MyTime {
    private int h, m, s;

    public MyTime(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }
    public MyTime nextHour(){
        MyTime time = new MyTime(h, m, s);
        time.h += 1;
        time.h %= 24;
        return time;
    }
    public MyTime nextMinute(){
        MyTime time = new MyTime(h, m, s);
        time.m += 1;
        if(time.m == 60){
            time.m = 0;
            time.h += 1;
            time.h %= 24;
        }
        return time;
    }
    public MyTime nextSecond(){
        MyTime time = new MyTime(h, m, s);
        time.s += 1;
        if(time.s == 60){
            time.s = 0;
            time.m += 1;
            time.m %= 60;
            if(time.m == 0){
                time.h += 1;
                time.h %= 24;
            }
        }
        return time;
    }
    public MyTime prevHour(){
        MyTime time = new MyTime(h, m, s);
        time.h -= 1;
        if(time.h == -1){
            time.h = 23;
        }
        return time;
    }
    
    public MyTime prevMinute(){
        MyTime time = new MyTime(h, m, s);
        time.m -= 1;
        if(time.m == -1){
            time.m = 59;
            time.h -= 1;
            if(time.h == -1){
                time.h = 23;
            }
        }
        return time;
    }
    
    public MyTime prevSecond(){
        MyTime time = new MyTime(h, m, s);
        time.s -= 1;
        if(time.s == -1){
            time.s = 59;
            time.m -= 1;
            if(time.m == -1){
                time.m = 59;
                time.h -= 1;
            }
            if(time.h == -1){
                time.h = 23;
            }
        }
        return time;
    }
    
    @Override
    public String toString(){
        return String.format("%02d", h) + ":" + String.format("%02d", m) + ":" + String.format("%02d", s);
    }
    
}

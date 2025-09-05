package oopsdemo1;

/**
* Author  : Shozaib.Zulfiqar
* Date    : Sep 3, 2025
* Time    : 12:43:00 PM
* Project : CoreJava
*/

/*Java program to perform addition of 2 Times
* t1 --> 12 : 45 :55 
* t2 --> 10 : 30 :30
*        23    16 :25
* 
* t1 + t2
*   if sec> 60 .. mins should be incremented & sec -60,,
*   if min> 60  ... hrs should be incremented & min -60
*   
*/

public class Time {
	
	private int hrs , min , sec;

	public Time(int hrs, int min, int sec) {
		this.hrs = hrs;
		this.min = min;
		this.sec = sec;
	}
	
	public void add(Time obj) {
		int sum = obj.sec + this.sec;
		if(sum >= 60) this.min++;
		this.sec = sum%60;
		
		sum = obj.min + this.min;
		if(sum>=60) this.hrs++;
		this.min = sum%60;
				
		
		sum = obj.hrs + this.hrs;
		this.hrs  = sum%24;
		
	}

	@Override
	public String toString() {
		return "Time [hrs=" + hrs + ", min=" + min + ", sec=" + sec + "]";
	}
	
	
	public static void main(String[] args) {
		Time t1 = new Time(10,25,59);
		Time t2 = new Time(9,25,1);
		
		System.out.println(t1);
		System.out.println(t2);
		
		t2.add(t1);
		System.out.println(t2);
	}

}

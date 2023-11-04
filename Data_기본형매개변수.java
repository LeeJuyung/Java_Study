package org.java_SummerStudy;
class Data{int x;}
public class Data_기본형매개변수 {

	public static void main(String[] args) {
		Data d=new Data();
		d.x=10;
		System.out.println("main(): x = "+d.x);
		
		change(d);
		System.out.println("변경 후 (d.x)");
		System.out.println("main(): x = "+d.x);
	}
		static void change(Data d) {//<-Data d라는 참조
			d.x=1000;
			System.out.println("change() : x= "+d.x);
		} //그냥 x면 원본이 안 바뀜을 보여주는 것임. 바꾸려면 참조형으로 해야 함.
}

/**
 *测试算数运算符的用法
*/

public class TestOperator01{

	public static void main(String[] args){

		int a= 3;
		long b= 4;
		long c=a+b;

		double d = 3+3.14;
		double d2 = 32/3;//两个整数相除，直接保留结果的整数部分，没有四舍五入
		System.out.println(d2);
		//+，-，*，/
		//取余数
		int e = 10 %3;		//取余操作。结果符号和左边操作数相同
		System.out.println(e);

		//测试自增、自减
		int g = 30;
		g++;		//相当于：g = g+1；
		g--;		//相当于：g = g-1；
		

		g=10;
		int  h = g++; 	//g++先赋值，再自增；
		g=10;
		int i= ++g;	//++g先自增，再赋值；
		System.out.println(h);
		System.out.println(i);
	}
	
}
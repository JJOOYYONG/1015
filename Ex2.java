package com.exam.gui;


	
	class A{
		private int num;
		
		
		
		//instace(객체단위)내부클래스 정의
		public class B{
			
		}
	}
	
	class C{
		//static(클래스단위)내부 클래스 정의
		public static class D{
			
		}
	}
	


public class Ex2 {


	public static void main(String[] args) {
		
		A a = new A();
		A.B b = a.new B(); // 바깥에서 접근하는 경우, 이렇게 잘 적지는 않음
		
		
		C c = new C();
		C.D d = new C.D(); // 바깥에서 접근하는 경우(중요)
		
//		A.B b = new A.B();

	}//main

}

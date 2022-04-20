interface A{
	int a=10;
	
	public void printA();
}
interface A1 extends A{
	int a=20;
	public void printA1();
}
interface A2 extends A{
	int a=30;
	public void printA2();
}
interface P1{
	int a=40;
	public void printP1();
}
interface P2{
	int a=50;
	public void printP2();
}
interface A12 extends P1,P2{
	int a=60;
	 public void printA12();
}
class B implements A12{
	public void printA()
	{
		System.out.println("I am a A "+"Value Of Variable="+A.a);
	}
	public void printA1()
	{
		System.out.println("I am a A1 "+"Value Of Variable="+A1.a);
	}
	public void printA2()
	{
		System.out.println("I am a A2 "+"Value Of Variable="+A2.a);
	}
	public void printP1()
	{
		System.out.println("I am a P1 "+"Value Of Variable="+P1.a);
	}
	public void printP2()
	{
		System.out.println("I am a P2 "+"Value Of Variable="+P2.a);
	}
	public void printA12()
	{
		System.out.println("I am a A12 "+"Value Of Variable="+A12.a);
	}

}
class Lab72{
	public static void main(String[] args) {
		 B objb=new B();
		objb.printA();
		objb.printA1();
		objb.printA2();
		objb.printP1();
		objb.printP2();
		objb.printA12();
		
	}
}

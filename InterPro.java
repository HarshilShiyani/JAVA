interface A{
	int aa=10;
	public void printA();

}
interface A1 extends A{
	int bb=20;
	public void printA1();

}
interface A2 extends A{
	int cc=30;
	public void printA2();

}
interface P1{
	int dd=40;
	public void printP1();


}
interface P2{
	int ee=50;
	public void printP2();


}
interface A12 extends P1,P2{
	int ff=60;
	public void printA12();


}
Class B implements A12{
	public void printA()
	{
		System.out.print("I am a A"+a);
	}
}
Class InterPro{
	public static void main(String[] args){
		B obj=new B();
		obj.printA();
	}
}
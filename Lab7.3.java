interface Transport {
	public void deliver();
}
abstract class Animal{

}
class Tiger extends Animal{

}
class Camel extends Animal implements Transport {
	public void deliver()
	{
		System.out.println("I am a Camel");
	}
	Camel()
	{
		deliver();
	}
}
class Deer extends Animal{

}
class Donkey extends Animal implements Transport{
	public void deliver()
	{
		System.out.println("I am a Donkey");
	}

	Donkey()
	{
		deliver();
	}

}
class Lab73{
	public static void main(String[] args) {
		Tiger tig=new Tiger();
		Camel cam=new Camel();
		Deer deer=new Deer();
		Donkey don=new Donkey();



	}
}

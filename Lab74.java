interface EventListener
{
	public void performEvent();
}
interface MouseListener extends EventListener
{
	public void mouseClicked(); 
	public void mousePressed(); 
	public void mouseReleased();
	public void mouseMoved();
	public void mouseDragged();
}
interface KeyListener extends EventListener
{
	public void keyPressed(); 
	public void keyReleased();
}
class EventDemo implements MouseListener,KeyListener
{
  	
  	public void performEvent()
  	{
	System.out.println("I am calling.......performEvent");  		
  	}
  	public void mouseClicked()
  	{
	System.out.println("I am calling.......mouseClicked");
  	}
	public void mousePressed()
	{
	System.out.println("I am calling.......mousePressed");
	}
	public void mouseReleased()
	{
	System.out.println("I am calling.......mouseReleased");
	}
	public void mouseMoved()
	{
	System.out.println("I am calling.......mouseMoved");
	}
	public void mouseDragged()
	{
	System.out.println("I am calling.......mouseDragged");
	}
	public void keyPressed()
	{
	System.out.println("I am calling.......keyPressed");
	} 
	public void keyReleased()
	{
	System.out.println("I am calling.......keyReleased");
	}
  	/*make Constructer of EventDemo Class*/
  	EventDemo()
  	{
  	performEvent();
  	mouseClicked(); 
	mousePressed(); 
	mouseReleased();
	mouseMoved();
	mouseDragged();
	keyPressed(); 
	keyReleased();
  	}
}
class Lab74{
	public static void main(String[] args) 
	{
		EventDemo eventobj=new EventDemo();
	}
}
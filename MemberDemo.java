class Member
{
	String name;
	int age;
	String phone_number;
	String address;
	double salary;


public Member(String name,int age,String phone_number,String address,double salary)
	{
 	this.name=name;
 	this.age=age;
 	this.phone_number=phone_number;
 	this.address=address;
 	this.salary=salary;
	}


void printSalary()
{
	this.salary=salary;
	System.out.println("Salary="+ this.salary);
}
}
class Employee  extends Member{

	String specialization;


public Employee(String name,int age,String phone_number,String address,
	double salary,String specialization) 
{
	super(name,age,phone_number,address,salary);
	this.specialization=specialization;
}
	void print_manager_details()
	{

       System.out.println("Name="+name);
       System.out.println("Age="+age);
       System.out.println("Phone_number="+phone_number);
       System.out.println("Address="+address);
       System.out.println("Specialization="+specialization);
	}
}
class Manager  extends Member{

	String department;
	
 
public Manager(String name,int age,String phone_number,String address,
	double salary,String department) 
   {
   	super(name,age,phone_number,address,salary);
	this.department=department;
}
 	void print_manager_details()
	{
		System.out.println("");
		System.out.println("===================================");
       	System.out.println("Name="+name);
       	System.out.println("Age="+age);
       	System.out.println("Phone_number="+phone_number);
       	System.out.println("Address="+address);
       	System.out.println("Specialization="+department);
	}
}

class MemberDemo
	{
	public static void main(String[] args) 
	{
		Employee objemp=new Employee("harshil",18,"7698347840","Rajkot",1899,"java");
		objemp.print_manager_details();
		objemp.printSalary();
		Manager objman=new Manager("Bala",40,"0123456789","Kodki",1199,"cse");
		objman.print_manager_details();
		objman.printSalary();
	}	
	}

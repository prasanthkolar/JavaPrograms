package programs.com;

public class MethodOverridingChildClass extends MethodOverridingParentClass{

	
	public void myMethod()
	{
		System.out.println("i am in child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverridingParentClass object=new MethodOverridingChildClass();
		object.myMethod();

	}

}

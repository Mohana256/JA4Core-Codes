package test1;//inheritence

class C {
	
	String name = "java";
	String city = "blr";
	public void disp() 
	{
		System.out.println("i am from disp()");
	}
}
class E extends C
	{
		String email = "java@123";
		String ph = "12334";
		
		public void show() 
		{
			System.out.println(name+" "+email+" "+ph+" "+city);
		}
	}
public class A
{
	public static void main(String[] args) {
			E b = new E();
			b.disp();
			b.show();
		}

	}

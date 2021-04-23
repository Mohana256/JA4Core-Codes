package test1;
interface Inf{
	float pi=3.14f;//common data//
	
	void dog();//abstract method//It will consider default as abstract in interface
	
	
	default void cat() {
		System.out.println("cat() from inf");
	}
	static void fox() {
		System.out.println("fox() from inf");
	}
	
}

abstract class Abs implements Inf{
	
	public abstract void disp();
	
	public void human() {
		System.out.println("human() from abs");
	}
} 
class AbsImpl extends Abs{
	
	@Override
	public void dog() 
	{
		System.out.println("Overriding dog()");
	}
	@Override
	public void disp() 
	{
		System.out.println("disp() overrided");
	}
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsImpl il = new AbsImpl();
		il.dog();
		il.disp();
		il.human();
		il.cat();
		//il.fox();//static keyword not participate in heritence
		Inf.fox();
	}

}

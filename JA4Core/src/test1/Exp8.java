package test1;
interface Inf1{
	void add();
	void sub();
}
abstract class Abs1{
	public void details() {
		System.out.println("normal method of abs");
	}
	public abstract void hello();
}
class Impl1 extends Abs1{
	public void hello() {
		System.out.println("Overriding hello()");
	}
	public void add() {
		System.out.println("Overide inf1");
	}
	public void sub() {
		System.out.println("Override inf1");
	}
}
public class Exp8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Impl1 il1 = new Impl1();
		il1.hello();
		il1.add();
		il1.sub();
		il1.details();

	}

}

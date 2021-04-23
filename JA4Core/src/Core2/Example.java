package Core2;

public class Example {
	int x;
	float f;
	char c;
	boolean b;
	public void show() {
		System.out.println(x);//0
		System.out.println(f);//0.0
		System.out.println(c);//nothing
		System.out.println(b);//false
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example obj = new Example();
        obj.show();
	}

}

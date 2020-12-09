package Maven_Aufgabe3.Aufgabe3;

public class Calculator implements ICalculator{
	
	
	public int add(int a,int b) {
		
		return (a+b);
		
	}

	@Override
	public int minus(int a, int b) {
		
		return (a-b);
	}

	@Override
	public int multi(int a, int b) {
		
		return (a*b);
	}

	@Override
	public int div(int a, int b) {
		
		return (a/b);
	}
	
	
	
	

}

package package1;

public class test {
	
	public void pubMethod() {
		System.out.println("pubMethod");		
	}
	
	protected void proMethod() {
		System.out.println("proMethod");		
	}
	
	void defMethod() {
		System.out.println("defMethod");		
	}
	
	private void priMethod() {
		System.out.println("priMethod");		
	}
	
	public static void main(String[] args){
		//System.out.println("package test");	
		
		test t = new test();
		t.pubMethod();
		t.proMethod();
		t.priMethod();
		t.defMethod();
	}
}
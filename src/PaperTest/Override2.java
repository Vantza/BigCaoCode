package PaperTest;

public class Override2 {
	public Override2 foo() {return this;}
}

class Two extends Override2 {
	public Override2 foo() {return this;}
}

class Three extends Two {
	
	//public void foo() {}	重写的返回类型不对
	
	//public int foo() {return 3;}	重写的返回类型不对
	
	//public Two foo() {return this;}	正确
	
	//public Override2 foo() {return this;}	正确
	
	//public Object foo() {return this;}	重写的返回类型不对
}

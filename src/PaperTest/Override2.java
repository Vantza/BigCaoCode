package PaperTest;

public class Override2 {
	public Override2 foo() {return this;}
}

class Two extends Override2 {
	public Override2 foo() {return this;}
}

class Three extends Two {
	
	//public void foo() {}	��д�ķ������Ͳ���
	
	//public int foo() {return 3;}	��д�ķ������Ͳ���
	
	//public Two foo() {return this;}	��ȷ
	
	//public Override2 foo() {return this;}	��ȷ
	
	//public Object foo() {return this;}	��д�ķ������Ͳ���
}

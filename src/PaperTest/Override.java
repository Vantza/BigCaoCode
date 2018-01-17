package PaperTest;

public class Override {
	public int addValue(int a, int b) {
		int s;
		s = a+b;
		return s;
	}
}


// 方法权限不够 不是public
class Child extends Override {
//	// 方法权限不够
//	int addValue(int a,int b){
//		return 1;
//	}
	
	public void addValue(){};
	
	public int addValue(int a) {return 1;};
	
	public int addValue(int a,int b) {return 1;}
}
package PaperTest;

public class Override {
	public int addValue(int a, int b) {
		int s;
		s = a+b;
		return s;
	}
}


// ����Ȩ�޲��� ����public
class Child extends Override {
//	// ����Ȩ�޲���
//	int addValue(int a,int b){
//		return 1;
//	}
	
	public void addValue(){};
	
	public int addValue(int a) {return 1;};
	
	public int addValue(int a,int b) {return 1;}
}
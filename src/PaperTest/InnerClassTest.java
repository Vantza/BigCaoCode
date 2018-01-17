package PaperTest;

public class InnerClassTest {
	private double d1 = 1.0;
	
	//�ڲ����з�������ʹ��static
//	class innerOne {
//		public static double methoda() {
//			return d1;
//		}
//	}
	
	
	//�ڲ����з�������ʹ��static
//	public class innerOne {
//		static double methoda() {return d1;}
//	}
	
	
	private class innerOne {
		double methoda() {return d1;}
	}
	
	
	//��̬���ڲ��ܷ��ʷǾ�̬����
//	static class innerTwo {
//		protected double methoda() {return d1;}
//	}
	
	abstract class innerTwo {
		public abstract double methoda();
	}
}

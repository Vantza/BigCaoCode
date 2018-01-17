package PaperTest;

public class InnerClassTest {
	private double d1 = 1.0;
	
	//内部类中方法不能使用static
//	class innerOne {
//		public static double methoda() {
//			return d1;
//		}
//	}
	
	
	//内部类中方法不能使用static
//	public class innerOne {
//		static double methoda() {return d1;}
//	}
	
	
	private class innerOne {
		double methoda() {return d1;}
	}
	
	
	//静态类内不能访问非静态数据
//	static class innerTwo {
//		protected double methoda() {return d1;}
//	}
	
	abstract class innerTwo {
		public abstract double methoda();
	}
}

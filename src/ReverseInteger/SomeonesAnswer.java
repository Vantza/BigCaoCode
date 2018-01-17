package ReverseInteger;
/**
 *  Only 15 lines.
	If overflow exists, the new result will not equal previous one.
	No flags needed. No hard code like 0xf7777777 needed.
	Sorry for my bad english.
 *
 */
public class SomeonesAnswer {
	public int reverse(int x) {
	    int result = 0;

	    while (x != 0) {
	        int tail = x % 10;
	        int newResult = result * 10 + tail;
	        if ((newResult - tail) / 10 != result)
	        { return 0; }
	        result = newResult;
	        x = x / 10;
	    }

	    return result;
	}
	
	public static void main(String[] args) {
		SomeonesAnswer sa = new SomeonesAnswer();
		System.out.println(sa.reverse(1000000003));
	}
}

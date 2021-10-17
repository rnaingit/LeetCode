package p2;

import java.util.Iterator;

public class FindSetOrUnset {
	 public static void isKthBitSet(int n,
             int k)
{
if ((n & (1 << (k))) > 0)
System.out.print("SET");
else
System.out.print("NOT SET");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 102, k = 3;
	        isKthBitSet(n, k);
	}
}

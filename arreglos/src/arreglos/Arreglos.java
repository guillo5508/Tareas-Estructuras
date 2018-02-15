package arreglos;

import java.util.Arrays;

public class Arreglos {
	
	public static void main(String[] args) {
		int[] c= {1,2,3,4};
		int[] d= {0,0,0,0,0,0};
		c=Arrays.copyOf(c, c.length+1);
		//System.arraycopy(c, 0, d, 0, c.length+2);
		for(int i=0;i<=c.length-1;i++) {
			System.out.println(c[i]);
		}
		for(int e: c) {
			System.out.print(e+" ");
		}
		System.out.println();
	}

}

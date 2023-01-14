package com.main;

import java.util.BitSet;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
				
        BitSet[] a = new BitSet[] {null, new BitSet(n), new BitSet(n)};
        int m =scan.nextInt();
		
		for (int i = 0; i <m ; i++) {
			String out = scan.next();
			int s1 = scan.nextInt();
			int s2 = scan.nextInt();
			
			if(out.equals("AND")) {
				a[s1].and(a[s2]);
			}
			else if (out.equals("SET")) {
				a[s1].set(s2);
			}
			else if (out.equals("FLIP")) {
				a[s1].flip(s2);
			}
			else if (out.equals("OR")) {
				a[s1].or(a[s2]);
			}
			else if (out.equals("XOR")) {
				a[s1].xor(a[s2]);
			}
			System.out.println(a[1].cardinality()+" "+a[2].cardinality());
		}
		
		
	}

}

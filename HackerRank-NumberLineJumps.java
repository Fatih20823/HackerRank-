package com.main;

import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		int x1 = 5;
		int x2 = 10;
		int v1 = 3;
		int v2 = 3;
		int konum1,konum2;
		int jump=0;
		String sonuc = "NO";
		do {
			jump++;
			konum1 = x1 + v1*jump;
			konum2 = x2 + v2*jump;
				if(konum1 == konum2) sonuc = "YES";

		}while (konum1<konum2);
		System.out.println("sonuc = "+ sonuc);
	}

}

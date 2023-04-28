package day02;

import java.util.Random;

public class RndTest {
	public static void main(String[] args) {
		Double rd = Math.random();
		System.out.println("rand" + rd);
		Random rd2 = new Random();
		System.out.println("rand2" + rd2);
		
		String[] arr = {"hong","kin","pack"};
		System.out.println(arr[3]);
	}
}

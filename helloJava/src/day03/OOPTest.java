package day03;

import java.util.Iterator;

public class OOPTest {
	public static void main(String[] args) {
		Animal ani = new Animal();
		System.out.println(ani.age);
		ani.birth();
		System.out.println(ani.age);
		
		Human h = new Human();
		System.out.println("age: "+h.age);
		System.out.println(h);
		
		h.birth();
		h.farming("drag");
		h.farming("ciga");
		
		System.out.println("age: "+h.age);
		System.out.println(h);
		
	}
}

package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream2 {

	public static void main(String[] args) {
		//1way
		Stream<Object> stram1 = Stream.empty();
String str[] = {"m","s","t","p","q","r"};
     Stream<String> stram2 = Stream.of(str);
     stram2.forEach(c->{System.out.println(c);});
     
     List<Integer> list3 = new ArrayList<Integer>();
		list3.add(45);
		list3.add(85);
		list3.add(63);
		list3.add(85);
		list3.add(25);
		list3.add(78);
		list3.add(68);
		list3.add(28);
		Stream<Integer> stram3 = list3.stream();
		stram3.forEach(i->System.out.println(i));
		}
	

}

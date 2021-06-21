package com.stream;

import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

public class Stream3 {

	public static void main(String[] args) {
	List<String> list1 = List.of("pinky","somya","satyam","shourya","lokesh");
	List<String> newList1 =list1.stream().filter(s->s.startsWith("s")).collect(Collectors.toList());
newList1.forEach(p->System.out.println(p));

//map method
List<Integer> newList2 = Arrays.asList(2,3,4,5,6);
	newList2.stream().map(i->i*i).collect(Collectors.toList()).forEach(System.out::println);
	int i=newList2.stream().max((x,y)->x.compareTo(y)).get();
	System.out.println(i);
	
	Base64.Encoder encoder = Base64.getEncoder();
String  str =	encoder.encodeToString("welcome".getBytes());
System.out.println(str);

Base64.Decoder decoder = Base64.getDecoder();
String str1 = new String(decoder.decode(str));
System.out.println(str1);
	
	}

   
}

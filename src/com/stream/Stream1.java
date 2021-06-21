package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {

	public static void main(String[] args) {
		// create list using of() method , its return immutable elements
		List<Integer> list1 = List.of(12, 13, 14, 15, 16, 17);
//list1.add(45);
		// create list using Arrays.asList()
		List<Integer> list2 = Arrays.asList(45, 18, 46, 14);
		//list2.add(78);
		
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(45);
		list3.add(85);
		list3.add(63);
		list3.add(85);
		list3.add(25);
		list3.add(78);
		list3.add(68);
		list3.add(28);
		List<Integer> newList1 = new ArrayList<Integer>();
	/*	for(int i:list1) {
			if(i%2==0) newList1.add(i);
		}
		System.out.println(newList1);
*/
		newList1= list1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newList1);
		List<Integer> newList2=list3.stream().filter(p->p>45).collect(Collectors.toList());
		System.out.println(newList2);
		List<Integer> newList3 =list3.stream().sorted().collect(Collectors.toList());
		System.out.println(newList3);
	}

}

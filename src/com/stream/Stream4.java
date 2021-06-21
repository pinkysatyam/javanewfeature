package com.stream;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream4 {
	public static void main(String arg[]) {
		Map<String,Employee> map = new HashMap<String,Employee>();
		map.put("123", new Employee(4,"rohan",1600f));
		map.put("123", new Employee(6,"mohan",1200f));
		map.put("123", new Employee(5,"sohan",1500f));
		map.put("123", new Employee(3,"nohan",1000f));
		
		Set<Employee> set = new HashSet<Employee>(map.values());
		Set<Employee> set1 =set.stream().filter(e->e.getSalary()<1000f).sorted().collect(Collectors.toSet());
		System.out.println(set);
		System.out.println(set1);
	}

}

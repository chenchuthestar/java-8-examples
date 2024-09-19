package com.chenchu.java8example.streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {

	public static void main(String[] args) {
		
		String s = "she sells sea shells";
		String regex = "SsS";
		String replace = "X";
		Matcher matcher = Pattern.compile(regex).matcher(s);
		System.out.println(matcher.replaceAll(replace));

		List<String> fruits = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
		// wordcount
		Map<String, Long> result = fruits.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result);

		List<Item> items = Arrays.asList(new Item("apple", 10, new BigDecimal("9.99")),
				new Item("banana", 20, new BigDecimal("19.99")), new Item("orang", 10, new BigDecimal("29.99")),
				new Item("watermelon", 10, new BigDecimal("29.99")), new Item("papaya", 20, new BigDecimal("9.99")),
				new Item("apple", 10, new BigDecimal("9.99")), new Item("banana", 10, new BigDecimal("19.99")),
				new Item("apple", 20, new BigDecimal("9.99")));

		// groupby
		Map<String, Long> counting = items.stream()
				.collect(Collectors.groupingBy(Item::getName, Collectors.counting()));

		System.out.println(counting);

		// groupby-with sum
		Map<String, Integer> sum = items.stream()
				.collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));

		System.out.println(sum);

		List<String> letters = Arrays.asList("B", "A", "C");
		// natural sorting
		List<String> collect = letters.stream().sorted().collect(Collectors.toList());
		// reverse sorting
		List<String> collect2 = letters.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		List<Student> studentsList = MyStreamUtil.getListOfStudents();

		// sorting by one field
		List<Student> sortedStudentsList = studentsList.stream().sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());

		System.out.println(sortedStudentsList);

		// sorting by two fields
		List<Student> sortedStudentsList1 = studentsList.stream()
				.sorted(Comparator.comparing(Student::getName).thenComparing(Student::getAge))
				.collect(Collectors.toList());
		// SortByValue
		Map<String, Integer> unsortMap = new HashMap<>();
		unsortMap.put("z", 10);
		unsortMap.put("b", 5);
		unsortMap.put("a", 6);
		unsortMap.put("c", 20);
		unsortMap.put("d", 1);
		unsortMap.put("e", 7);
		unsortMap.put("y", 8);
		unsortMap.put("n", 99);
		unsortMap.put("g", 50);
		unsortMap.put("m", 2);
		unsortMap.put("f", 9);
		Map<String, Integer> sortedbyValue = unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new));
		// SortByKey
		Map<String, Integer> sortedbykey = unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new));

		// id name
		System.out.println(sortedStudentsList1);

		// List to Set
		List<Integer> listWithDuplicates = Arrays.asList(1, 3, 45, 56);

		Set<Integer> setWithoutDups = listWithDuplicates.stream().collect(Collectors.toSet());
		// distinct
		List<Integer> listWithoutDups = listWithDuplicates.stream().distinct().collect(Collectors.toList());

		// Average
		Integer[] arr1 = new Integer[] { 100, 24, 13, 44, 114, 200, 40, 112 };
		List<Integer> list = Arrays.asList(arr1);
		OptionalDouble average = list.stream().mapToInt(n -> n * n).filter(n -> n > 10000).average();

		// filter
		List<Employee> employeeList = MyStreamUtil.createEmployeeList();
		long count = employeeList.stream().filter(e -> e.getAge() > 25).count();

		// min
		Integer minNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).min(Comparator.comparing(Integer::valueOf)).get();
		Employee minObject = employeeList.stream().min(Comparator.comparing(Employee::getAge)).get();

		// max
		Integer maxNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).max(Comparator.comparing(Integer::valueOf)).get();
		Employee maxObject = employeeList.stream().max(Comparator.comparing(Employee::getAge)).get();
		// Duplicate Elements

		Set<Integer> duplicates = list.stream().filter(i -> Collections.frequency(list, i) > 1)
				.collect(Collectors.toSet());
		//common data between two list
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3));

		List<Integer> common = list1.stream()
		        .distinct()
		        .filter(list2::contains)
		        .collect(Collectors.toList());

		common.forEach(System.out::print);
	}

}

package streamsTutorial;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
	// @Test
	public void regular() {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Madalina");
		names.add("Robert");
		names.add("Fron");
		names.add("Pasniceanu");
		names.add("Alala");
		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
	}

	// @Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Madalina");
		names.add("Robert");
		names.add("Fron");
		names.add("Pasniceanu");
		names.add("Alala");
		// there is no life for tntermediate op if there is no terminal op
		// terminal op will execute only if inter op(filter) reuturns true

		Long c = names.stream().filter(s -> s.startsWith("A")).count();// lambda, have precondition on the left, and
																		// action on the right

		System.out.println(c);

		Long d = Stream.of("Ana", "Irina", "Andreea", "Adam").filter(s -> {
			s.startsWith("A");
			return true;

		}).count();
		System.out.println(d);
		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
	}

	// @Test
	public void streamMap() {
		// print names which have last letter "A" with Uppercase
		Stream.of("Ana", "Irina", "Andreea", "Adam").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		// print names which have first letter as a with uppercase and sorted
		List<String> names = Arrays.asList("Ana", "Irina", "Andreea", "Adam");
		names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

	}

	//@Test
	public void streamMap2() {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Madalina");
		names.add("Robert");
		names.add("Fron");
		names.add("Pasniceanu");

		List<String> names1 = Arrays.asList("Ana", "Irina", "Andreea", "Adam");
		names1.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		// newStream.sorted().forEach(s-> System.out.prinln(s));
		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Ana"));
		Assert.assertTrue(flag);
		System.out.println(flag);

	}

	@Test
	public void streamCollect() {
		List<String> ls = Stream.of("Ana", "Irina", "Andreea", "Adam").filter(s -> s.endsWith("a"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		List<Integer> values= Arrays.asList(3,2,4,6,6,3,4);
		values.stream().distinct().forEach(s->System.out.println(s));
		
		List<Integer> li= values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(3));
		
	}

}

package clase1tests;

import static org.junit.jupiter.api.Assertions.*;

import clase1.CountOccurrencesInt;
import clase1.CountOccurrences;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class CountOccurrencesTest {

	@Test
	public void testCountOccurrences() {
		System.out.println("countOccurrences");
		int arr[] = {7, 7, 5, 5, 5, 2, 3};
		String exp[] = {"7:2", "5:3", "2", "3"};
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		CountOccurrencesInt instance = new CountOccurrences();
		List<String> expResult = Arrays.stream(exp).collect(Collectors.toList());
		List<String> result = instance.countOccurrences(list);
		assertEquals(expResult, result);
	}
}
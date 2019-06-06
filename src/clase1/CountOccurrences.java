package clase1;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountOccurrences implements CountOccurrencesInt {

	
	
	@Override
	public List<String> countOccurrences(List<Integer> list) {
		// TODO Auto-generated method stub

	//List<String> result = list.stream().sorted().filter(n -> n >);
	//List<Long> countOcurrencies = list.stream().collect(Collectors.groupingBy(Function.identity()), Collectors.counting());
		countElements(list);
		list.stream().filter(x -> x.equals(2));
		return null;
	}

	public List<Integer> countElements(List<Integer> list){
		Stream<Integer> result = list.stream().filter(x -> x.equals(5));
		Map<Integer, Long> groupCounted = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		long occurrencesFor2 = groupCounted.get(2);
		long occurrencesFor3 = groupCounted.get(3);
		long occurrencesFor5 = groupCounted.get(5);
		long occurrencesFor7 = groupCounted.get(7);
		//list = (List<Integer>) groupCounted;
		return list;
	}
}

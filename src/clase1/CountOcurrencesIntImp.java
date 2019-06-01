package clase1;

import java.util.List;

public class CountOcurrencesIntImp implements CountOcurrencesInt{

	
	
	@Override
	public List<String> countOcurrences(List<Integer> list) {
		// TODO Auto-generated method stub
		
		int count2 = 0;
		int count3 = 0;
		int count5 = 0;
		int count7 = 0;
	
	List<String> result = list.stream().sorted().filter(n -> n >);	
		
		
		for (Integer recorrer : list) {
			
			if(recorrer==2) {
				count2++;
			}
			if(recorrer==3) {
				count3++;
			}
			if(recorrer==5) {
				count5++;
			}
			if(recorrer==7) {
				count7++;
			}
			
		}
		
		
		return null;
	}

	
}

package functional.programming.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamBasic {

	public static void main(String[] args) {
			ArrayList<Integer> ar = new ArrayList<Integer>();
			for(int k=0;k<15;k++)
				ar.add(k);
			for(Integer integer : ar)
				System.out.println(integer);
			Predicate<Integer> p = i->i%2==0;
			List<Integer> l2 = ar.stream().filter(p).collect(Collectors.toList());
			System.out.println(l2);
			
			Long count = ar.stream().filter(p).count();
			System.out.println(count);
			
			Function<Integer,Integer> f =  i->i*i*i;
			List<Integer> l3 = ar.stream().filter(p).map(f).collect(Collectors.toList());
			System.out.println(l3);
			
			
			/* Filter<Predicate<T> t>
			 * Map<Function<K,V f>
			 * Collect
			 * Count
			 * Sorted && Sorted(Compartor)
			 * Min(Compartor) & Max(Compartor)
			 * foreach
			 * ToArray
			 * Stream.Of()
			 * 
			 */
			
		
		
	}

}

package ironpeace.common;

import java.util.ArrayList;
import java.util.List;

public class Prioritize {

	public static <T> List<T> byString(List<T> list, StringGetter<? super T> getter) {
		List<T> newList = new ArrayList<T>();
		Integer biggest = 0;

		for(T t: list){
			Integer val = Integer.valueOf(getter.get(t));

			if(val > biggest){
				biggest = val;
				newList = new ArrayList<T>();
				newList.add(t);
			}else if(val.equals(biggest)){
				newList.add(t);
			}else{
				//do nothing
			}

		}
		return newList;
	}
	
	public static <T> List<T> byDouble(List<T> list, DoubleGetter<? super T> getter) {
		List<T> newList = new ArrayList<T>();
		double biggest = 0;

		for(T t: list){
			double val = getter.get(t);
			
			if(val > biggest){
				biggest = val;
				newList = new ArrayList<T>();
				newList.add(t);
			}else if(val == biggest){
				newList.add(t);
			}else{
				// do nothing
			}
			
		}
		return newList;
	}
}

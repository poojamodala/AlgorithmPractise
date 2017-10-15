package main;
import java.util.*;
import java.util.Map.Entry;
public class SortReviews {

		
		public static ArrayList<BusinessInfo> mergeSortedBusinesses(ArrayList<BusinessInfo> trendyBusinesses, ArrayList<BusinessInfo> favoriteBusinesses){
			HashMap<Integer, Integer> business = new HashMap<Integer, Integer>(); 
			for(int i = 0; i < trendyBusinesses.size();i++) {
				business.put(trendyBusinesses.get(i).businessId, trendyBusinesses.get(i).numReviews);
			}
			
			Set<Entry<Integer, Integer>> entries = business.entrySet(); 
			
			 
			
			Comparator<Entry<Integer, Integer>> valueComparator = new Comparator<Entry<Integer,Integer>>() { 
				@Override public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) { 
					Integer v1 = e1.getValue(); Integer v2 = e2.getValue(); return v1.compareTo(v2);
					} 
				}; 
				
				ArrayList<Entry<Integer, Integer>> listOfEntries = new ArrayList<Entry<Integer, Integer>>(entries); 
				
				Collections.sort(listOfEntries, valueComparator); 
				LinkedHashMap<Integer, Integer> sortedByValue = new LinkedHashMap<Integer, Integer>(listOfEntries.size()); 
				
				for(Entry<Integer, Integer> entry : listOfEntries){ 
					sortedByValue.put(entry.getKey(), entry.getValue()); 
					} 
				System.out.println("HashMap after sorting entries by values "); 
				Set<Entry<Integer, Integer>> entrySetSortedByValue = sortedByValue.entrySet(); 
				for(Entry<Integer, Integer> mapping : entrySetSortedByValue){ 
					System.out.println(mapping.getKey() + " ==> " + mapping.getValue()); 
					}
				return favoriteBusinesses; 
				}
	}
			

			
class BusinessInfo {
	  int businessId;
	  int numReviews;

	  public BusinessInfo(int businessId, int numReviews){
	    this.businessId = businessId;
	    this.numReviews = numReviews;
	  }
	}


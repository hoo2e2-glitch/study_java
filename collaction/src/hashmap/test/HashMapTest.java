package hashmap.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapTest {
	public static void main(String[] args) {
		
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("name", "홍길");
		userMap.put("age", 20);
		userMap.put("address", "서울시");
		userMap.put("name", "김길");
		
		System.out.println(userMap);
		
		userMap.get("name");
		System.out.println(userMap.get("name"));
		
		System.out.println(userMap.size());
		
//		사용안됨
//		for(Object user : userMap) {
//			System.out.println(user);
//		}

//		HashSet
//		.iterator()
		Set<String> keys = userMap.keySet();
			System.out.println(keys);
		
			  Iterator<Entry<String, Object>> userIter = userMap.entrySet().iterator();
		      
		      while(userIter.hasNext()) {
		    	 Entry<String, Object> userData = userIter.next();
		         
		         if(userData.getKey().equals("name")) {
		            System.out.println(userData.getValue());
		         }
		      }
		      
		      
		      
		   }
		}


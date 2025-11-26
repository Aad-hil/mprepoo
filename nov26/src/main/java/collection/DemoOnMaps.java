package collection;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoOnMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		HashMap<Integer,String> hm = new HashMap<Integer, String>();
//	
//		hm.put(1, "hyd");
//		hm.put(2, "chn");
//		hm.put(3, "blr");
//		hm.put(4, "mum");
//		hm.put(5, "del");
//		hm.put(6, "kol");
//		hm.put(7, "ahm");
//		hm.put(8, "pun");
//		hm.put(9, "jpr");
//		hm.put(10, "viz");
//		
//		System.out.println(hm.keySet());
//		System.out.println(hm.values());
//		System.out.println(hm.entrySet());
//		System.out.println(hm.getOrDefault(33, "shsh"));
//		Set<Integer>keyset = hm.keySet();
//		Collection<String>keyvalues = hm.values();
//		System.out.println(keyvalues);
//
//		Iterator<Integer> itr = keyset.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//
//		}
//		
//		Iterator<Entry<Integer,String>>entryitr = hm.entrySet().iterator();
//		while(entryitr.hasNext()) {
//			System.out.println(entryitr.next());
//
//		}
//		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
//
//        tm.put(1, "hyd");
//        tm.put(2, "chn");
//        tm.put(3, "blr");
//        tm.put(4, "mum");
//        tm.put(5, "del");
//        tm.put(6, "kol");
//        tm.put(7, "ahm");
//        tm.put(8, "pun");
//        tm.put(9, "jpr");
//        tm.put(10, "viz");
//
//        System.out.println(tm.keySet());       
//        System.out.println(tm.values());       
//        System.out.println(tm.entrySet());     
//        System.out.println(tm.getOrDefault(33, "shsh"));
//
//        Set<Integer> keyset1 = tm.keySet();
//        Collection<String> keyvalues1 = tm.values();
//        System.out.println(keyvalues1);
//
//        Iterator<Integer> itr1 = keyset1.iterator();
//        while (itr1.hasNext()) {
//            System.out.println(itr1.next());
//        }
//
//        Iterator<Map.Entry<Integer, String>> entryitr1 = tm.entrySet().iterator();
//        while (entryitr1.hasNext()) {
//            System.out.println(entryitr1.next());
//        }

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		ht.put(1, "hyd");
		ht.put(2, "chn");
		ht.put(3, "blr");
		ht.put(4, "mum");
		ht.put(5, "del");
		ht.put(6, "kol");
		ht.put(7, "ahm");
		ht.put(8, "pun");
		ht.put(9, "jpr");
		ht.put(10, "viz");

		System.out.println(ht.keySet());
		System.out.println(ht.values());
		System.out.println(ht.entrySet());
		System.out.println(ht.getOrDefault(33, "shsh"));

		Set<Integer> keyset1 = ht.keySet();
		Collection<String> keyvalues1 = ht.values();
		System.out.println(keyvalues1);

		Iterator<Integer> itr1 = keyset1.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		Iterator<Map.Entry<Integer, String>> entryitr1 = ht.entrySet().iterator();
		while (entryitr1.hasNext()) {
			System.out.println(entryitr1.next());
		}
		
		Enumeration<Integer> keys = ht.keys();
		System.out.println(keys);
		while (keys.hasMoreElements()) {
			System.out.println(keys.nextElement());
		}
		Enumeration<String> values = ht.elements();
		System.out.println(values);
		while (values.hasMoreElements()) {
			System.out.println(values.nextElement());
		}
	}

}

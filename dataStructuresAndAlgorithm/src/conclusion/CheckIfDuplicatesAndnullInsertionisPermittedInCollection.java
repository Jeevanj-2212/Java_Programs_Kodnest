package conclusion;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class CheckIfDuplicatesAndnullInsertionisPermittedInCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(123);
		al.add(null);
		al.add(123);
		System.out.println(al);
		System.out.println("ArrayList:null permitted duplicates are allowed");
		System.out.println("=========================================================");
		LinkedList li =new LinkedList();
		li.add(123);
		li.add(null);
		li.add(123);
		System.out.println(li);
		System.out.println("LinkedList:null permitted duplicates are allowed");
		System.out.println("=========================================================");
		ArrayDeque ad = new ArrayDeque();
		ad.add(123);
		//ad.add(null);
		ad.add(123);
		System.out.println(ad);
		System.out.println("ArrayDeque:null NOT permitted duplicates are allowed");
		System.out.println("=========================================================");
		PriorityQueue pq = new PriorityQueue();
		pq.add(123);
		//pq.add(null);
		pq.add(123);
		System.out.println(pq);
		System.out.println("PriorityQueue:null NOT permitted duplicates are allowed");
		System.out.println("=========================================================");
		TreeSet tr = new TreeSet();
		tr.add(123);
		//tr.add(null);
		tr.add(123);
		System.out.println(tr);
		System.out.println("TreeSet:null NOT permitted duplicates are NOT allowed");
		System.out.println("=========================================================");
		HashSet hs = new HashSet();
		hs.add(123);
		hs.add(null);
		hs.add(123);
		System.out.println(hs);
		System.out.println("HashSet:null permitted duplicates are NOT allowed");
		System.out.println("=========================================================");
		LinkedHashSet lh = new LinkedHashSet();
		lh.add(123);
		lh.add(null);
		lh.add(123);
		System.out.println(lh);
		System.out.println("LinkedHashSet:null permitted duplicates are NOT allowed");
		System.out.println("=========================================================");
		

	}

}

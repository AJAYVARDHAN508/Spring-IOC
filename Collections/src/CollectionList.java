import java.util.*;

public class CollectionList {
	public static void main(String[] args) {
		
		List<String> al = new ArrayList<>();
		al.add("ajay");
		al.add("pawan");
		al.add("sriram");
		al.add("mani");
		al.add("nagaraj");
		
		/*for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		ListIterator<String> itr = al.listIterator();
		System.out.println("in forward direction");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("in reverse direction");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}*/
	/*	Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		al.forEach(a->{
			System.out.println(a);
		});
	}

}

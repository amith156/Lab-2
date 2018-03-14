package Exercise1;

public class ListMain {
	public static void main(String args[]) {
		LList<Integer> myList = new LList<Integer>(); // <>
		LList<Integer> myList1 = new LList<Integer>(); // <>
		System.out.println(myList);
		System.out.println("length = " + myList.length());
		myList.addToFront(5); // <5>
		myList.addToFront(4); // <45>
		myList.addToFront(3); // <345>
		
		System.out.println(myList);
		myList.addToBack(8); // <3458>
		myList.addToFront(3); // <345>
		myList.addToBack(9); // <34589>
		System.out.println(myList);
		System.out.println("length = " + myList.length());
		for (int i = 0; i < 7; i++)
			try {
				System.out.println(myList.elementAt(i));
			} catch (ListException e) {
				System.out.println("ERROR: " + e);
			}

		LList<String> mySList = new LList<String>();
		mySList.addToFront("hello");
		mySList.addToBack("goodbye");
		System.out.println(mySList);
		
		System.out.println("++++++++++++++");
		System.out.println("found position = "+ myList.find(8));
//		myList1.addToFront(20);
//		myList1.addToFront(5);
//		myList1.addToFront(60);
//		myList1.addToFront(24);
//		myList1.addToFront(3);
//		print_common_objects(myList,myList1);
		
		myList.removeAll(3);
		System.out.println(myList);
	}
	
	
//	public static <T> void print_common_objects(LList<T> a1, LList <T> a2)
//	{
//		T a1_data;
//		
//		for(int i=0; i<= a1.length(); i++)
//		{
//			a1_data = a1.elementAt(i);
//			
//			for(int j=0; j<= a2.length(); j++)
//			{
//				j
//				
//				
//			}
//		
//		
//		for (int i = 0; i<a1.length(); i++)
//	    { 
//			T x = a1.elementAt(i);
//			if (a1.find(x)==i && a2.find(x)!=-1)
//			{
//	                      // l1.find(x)==i is used to check if this is the first occurrence of x
//	                      // if it's not x will have been output already (if it's in l2)
//	        System.out.println(x);
//			}
//			
//		}
//		
//		
//	}
	
	
}

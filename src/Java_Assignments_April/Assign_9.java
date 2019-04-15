//9.how to read first element from linkedlist?

package Java_Assignments_April;

import java.util.LinkedList;

public class Assign_9 {

public static void main(String a[]){

	LinkedList<String> arrl = new LinkedList<>();
	arrl.add("gowri");
	arrl.add("poonam");
	arrl.add("savith");
	arrl.add("sweetha");
	
	System.out.println("Fiest Element: "+arrl.element());
	System.out.println("Fiest Element: "+arrl.getFirst());
	System.out.println("Fiest Element: "+arrl.peek());
	System.out.println("Fiest Element: "+arrl.peekFirst());
}
}
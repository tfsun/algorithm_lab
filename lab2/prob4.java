package lab2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class prob4 {

	public static List<Set> powerSet(ArrayList X){
		ArrayList<Set> P = new ArrayList<Set>();
		Set S = new HashSet();
		P.add(S);
		if(X.size()==1){
			Set ss = new HashSet();
			ss.add(X.get(0));
			P.add(ss);
			return P;
		}
		Set F = new HashSet();
		while(!X.isEmpty()) {
			Object x = X.get(0);
			X.remove(0);

			
			List<Set> restPart = powerSet((ArrayList)X.clone());

			//System.out.println("all possible X set: " + restPart);
			for(Set xx: restPart){
				xx.add(x);
				P.add(xx);
			}		
			System.out.println();	
		}
		
		return P;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(5);
		//list.add(7);
		
		System.out.println(powerSet(list));
	}

}

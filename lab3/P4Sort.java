package lab3;

import javax.naming.ldap.SortControl;

public class P4Sort {
	static void sort(int[] array){
		int index = 0;
		int i = 0;
		for (; i < array.length; i++) {
			if (array[i]==0) {
				int tmp = array[i];
				array[i] = array[index];
				array[index++] = tmp;
			}
		}
		i = index;
		for (index=array.length-1; i < array.length && i < index; i++) {
			if (array[i]==2) {
				int tmp = array[i];
				array[i] = array[index];
				array[index--] = tmp;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={1,0,2,0,0,1,2,2,2,1,0};
		sort(array);
		for (int i : array) {
			System.out.print(i + " ");
		}
	}

}

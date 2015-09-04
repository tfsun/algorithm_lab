package lab2;

public class CP6 {

	//return number of 0s
	int CountElement(int[] arrInt) {
		return CountElement(arrInt,0,arrInt.length-1);
	}
	int CountElement(int[] arrInt, int start, int end) {
		if (end - start < 1) {
			if (arrInt[start] == 0) {
				return arrInt.length;
			}
			return start;
		}
		int index = start + (end - start + 1)/2;
		if (arrInt[index] > arrInt[index-1]) {
			return index;
		}
		else if (arrInt[index] == 0) {
			return CountElement(arrInt, index, end);
		}
		else  {
			return CountElement(arrInt, start, index-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CP6 cp6= new CP6();
		int[] a = {0,0,0,1,1,1,1};
		System.out.println("num of 0 = " + cp6.CountElement(a) + ", num of 1 = " + (a.length - cp6.CountElement(a)));
	}

}

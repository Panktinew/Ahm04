package day2;

public class ForEachLoop_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr1 = {12,56,78,0,11,-1};
		int[] arr2 =new  int[12];
		String[] name = new String[3];
		name[0] = "Delhi";
		name[1] = "Ahmedabad";
		name[2] = "Bombay";
		
		arr2[0]=31;
		arr2[1]=3;
		arr2[2]=5;
		arr2[3]=1;
		arr2[4]=6;
		
		
		/*for (int i=0;i<arr1.length;i++) {
			
			System.out.println(arr1[i]);
		}*/
		int sum1 =0;
		for(int k :arr2) {
		//	sum1 = sum1+k;
			sum1 += k;  // sum1 = sum1+k;
			System.out.println(k);
		}
		System.out.println(sum1 + " ");
		for(String s : name) {
			System.out.print(s + " ");
		}

	}

}

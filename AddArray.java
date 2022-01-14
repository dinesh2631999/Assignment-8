package hw;

public class AddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num1=new int[] {1,2,3,4,5};
		int[] num2=new int[] {5,4,3,2,1};
		int sum;
		
		for(int i=0,j=0;i<num1.length&&j<num2.length;i++,j++)
		{
			sum=num1[i]+num2[j];
        System.out.println("the sum = " +sum );
	}

}
}

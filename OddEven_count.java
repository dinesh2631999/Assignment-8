package hw;

public class OddEven_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num=new int[] {1,2,3,4,5,6,7,8,9,10};
		int odd=0;
		int even=0;
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0) {
				for(int j=1;j==j;j++)
			{
			even=even+j;
			}
			}
		}
		
		System.out.println();
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2!=0) {
				for(int k=1;k==k ;k++)
			{
				odd=odd+k;
			}
			}
		}
		
		System.out.println("the even no count = "+even );
		System.out.println("the odd no count = "+ odd );

	}

}

package hw;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n= {2,4,6,8,10};
		int sum=0;
		
		for(int i=0;i<n.length;i++)
		{
			sum=sum+n[i];
		}
        int Avg=sum/5;
        System.out.println("the average = "+Avg);
	}

}

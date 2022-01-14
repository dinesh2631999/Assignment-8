package hw;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {12,34,10,4,50,18};
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<30)
			{
				System.out.println("the minimum no :" +num[i]);
			}else if(num[i]>30)
			{
			System.out.println("the maximum no :" +num[i]);	
			}
		}

	}

}

package hw;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {10,20,30,40,50,60,70};
		
		for(int i=0;i<num.length;i++)
		{
			if(i==3)
			{
				continue;
			}
			System.out.print( num[i] +" " );
		}

	}

}

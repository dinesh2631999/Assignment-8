package hw;

public class A_Z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alph=new char[26];
		char j='a';
		for(int i=0;i<alph.length;i++)
		{
			alph[i]=j;
			j++;
		}
		for(char letter : alph)
		{
			System.out.print(letter + " ");
		}

	}

}

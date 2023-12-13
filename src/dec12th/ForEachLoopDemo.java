package dec12th;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		
		int[] a=new int[5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		
		System.out.println(a.length);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		//enhanced for loop or for-each loop
		
		for(int temp:a)
		{
			System.out.println(temp);
		}

	}

}

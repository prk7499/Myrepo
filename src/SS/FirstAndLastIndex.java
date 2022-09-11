package SS;

public class FirstAndLastIndex {

	public static void main(String[] args) {
		
		int [] arr= {1,2,3,3,4,4,4,4,5,5,7,8};
		int search=4;
		int first=-1;
		int last=-1;
	
		for(int abc:arr)
		{
			System.out.print(abc);
		}
		System.out.println("");
		for(int i=0;i<=arr.length-1;i++)
		{
			
			if(arr[i]==search && first ==-1) {
				first=i;
			}else if(arr[i]==search && first !=-1)
			{
				last=i;
			}
		}
		
		System.out.println(first);
		System.out.println(last);
	}
}

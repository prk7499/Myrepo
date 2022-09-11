package SS;

public class SaperateString {

	public static void main(String[] args) {

		String abc="highb%^&3566vaoltage";
		String digit="";
		String character="";
		String alpha="";
		
		char[] pqr=abc.toCharArray();
		
		for(int i=0;i<=pqr.length-1;i++)
		{
			if(Character.isDigit(pqr[i]))
			{
				digit=digit+pqr[i];
			}else if(Character.isAlphabetic(pqr[i]))
			{
				character=character+pqr[i];
			}else {
				alpha=alpha+pqr[i];
			}
		}
		
		System.out.println("digits are:: "+digit);
		System.out.println("characters are:: "+character);
		System.out.println("symbols are:: "+alpha);

	}

}

package SS;


class pqr{
static boolean flag=false;
public static void prime(int num)
{
	for(int i=2;i<=num /2; ++i)
	{
		if(num%i==0)
			{
				flag=true;
				break;
			}
	}
	if(!flag)
	{
	System.out.println("prime nume"+num);
	}else
	{
	System.out.println("not prime number"+num);
	}


}
public static void main(String [] args){
pqr.prime(15);
pqr.prime(17);
pqr.prime(19);
}

}
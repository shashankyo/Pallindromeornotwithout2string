package pallindromWithoutSec;

public class Program {
public static void main(String[] args) {
	String str = "shashank";
	int flag = 0;
	int n = str.length();
	int j = n-1;
	for(int i=0;i<n/2;i++)
	{
			if(str.charAt(i)== str.charAt(j--))
			{
				flag = 1;
			}
			else
			{
				flag = 0;
				break;
			}
		}
		if (flag == 1)
		{
			System.out.println("string is pallindrome");
		}else {
			System.out.println("not a pallindrome");
		}
	}
}


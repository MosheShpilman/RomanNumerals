
public class RomanNumerals {
	
	String digitToString(int digit, String one, String five, String ten)
	{
		String result="";
		switch (digit)
		{
		case 1: result=one;
				break;
		case 2:	result=one+one;
				break;
		case 3: result=one+one+one;
				break;
		case 4: result=one+five;
				break;
		case 5: result=five;
				break;
		case 6: result=five+one;
				break;
		case 7: result=five+one+one;
				break;
		case 8: result=five+one+one+one;
				break;
		case 9: result=one+ten;
		}
		return result;
	}

	public String toRoman(int nmber) {
		int temp = nmber;
		int count = 0;
		while(temp!=0)
		{
			temp=temp/10;
			count++;
		}
		
		temp=nmber;
		int digit;
		String result = "";
		for(int i=1; i<=count;i++)
		{
			digit=temp%10;
			temp=temp/10;
			switch(i)
			{
				case 1:
						result = digitToString(digit,"I","V","X");
						break;
				case 2:
						result = digitToString(digit, "X", "L", "C")+result;
						break;
				case 3:
						result = digitToString(digit, "C", "D", "M")+result;
						break;
				case 4: 
						result = digitToString(digit, "M", null, null)+result;
					
			}
		}
		return result;
		
	}

}

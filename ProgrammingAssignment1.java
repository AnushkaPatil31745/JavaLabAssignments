import java.util.Arrays;
import java.util.List;

public class 2022BIT018 {

public int getValidRegistrationsCount(String []enroll)
{
	int count =0;
	boolean isValid =true;
	if(enroll == null)
	{
		return -1;
	}
	for(int i=0;i<enroll.length;i++)
	{
		isValid =true;
		if(enroll[i] == null)
		{
			continue;
		}
		if(enroll[i].length() != 10)
		{
			continue;
		}
		else
		{
			for(int j=0;j<enroll[i].length();j++)
			{
				if(j < 4 || (j >= 7 && j < enroll[i].length()))
				{
					char charAtInd = enroll[i].charAt(j);
					if(!Character.isDigit(charAtInd))
					{	
						isValid = false;
						break;
					}
				}
				else
				{
					Integer year = Integer.parseInt(enroll[i].substring(0, 4));
					if(year < 2000 || year >=2024)
					{
						isValid = false;
						break;
					}
				}
				if(j >= 4 && j < 7)
				{
					String departmentId = enroll[i].substring(4,7);
					if(!(departmentId.equalsIgnoreCase("bit") || departmentId.equalsIgnoreCase("bcs") || departmentId.equalsIgnoreCase("bme") || departmentId.equalsIgnoreCase("bch")))
					{
						isValid = false;
						break;
					}
			       }
			}
			if(isValid)
			{
				count++;
			}
		}
	}	
	return count;
}
public static void main(String[] args)
{
	String []enrollment = {null,"2023Bit018","1999bit018","2025bcs018"};
	SY2023bit018 data = new SY2023bit018();
	int count  =data.getValidRegistrationsCount(enrollment);
	System.out.println(count);
}
}

import java.util.ArrayList;
import java.util.List;
/**
 * Cool stuff
 * @author Chris Fischer
 *
 */
public class robotDriver 
{
	private static List<Motor> list;
	public static void main(String[] args)
	{
		list = new ArrayList<Motor>();
	}
	private void initializeList()
	{
		list.add(new Motor());//Add Neo, CIM, and mini CIM
	}
}

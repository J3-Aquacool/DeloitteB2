import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
class Person
{
	
	
	int pid;
	String name;
	public Person(int pid, String name) {
		super();
		this.pid = pid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + "]";
	}
	
}
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Map<Integer,String> m=new TreeMap();
		
		
		m.put(101,"Java");
		m.put(102,"Java");
		m.put(102,"Java");
		
		*/
Map<Integer,Person> m=new TreeMap();
		
		
		m.put(101,new Person(101, "ABC"));
		m.put(104,new Person(102, "XYZ"));
		m.put(110,new Person(101, "KLM"));
		
		System.out.println(m);
		
		
		
		
		//Set s=m.entrySet();
		
		for(Map.Entry<Integer, Person> me:m.entrySet())
		{
		//	System.out.println(me.getKey());
			//System.out.println(me.getValue());
			
			System.out.println(me.getValue().name);
					
			
		}
		
		
		// Access only the keys
		
	
		
		
		
		
		
		
	}

}

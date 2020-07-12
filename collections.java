import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class collections {

	public static void main(String[] args) {

		
		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Socrates");
		employeeNames.add("Plato");
		employeeNames.add("Aristotle");
		employeeNames.add("Kant");
		employeeNames.add("Hume");
		
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(12345);
		ids.add(12346);
		ids.add(12347);
		ids.add(12348);
		ids.add(12349);
		
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		//part 5
		int i = 0;
		for (int id : ids) {
			employeeMap.put(id, employeeNames.get(i));
			i++;
		
		}
		
		//part 6
		for (int k : employeeMap.keySet()) {
			System.out.println(k + " - " + employeeMap.get(k));
		}
		
		//part 7
		StringBuilder idsBuilder = new StringBuilder();
		
		//part 8
		for (int id : ids) {
			idsBuilder.append(id).append("-");
		}
		
		//part 9
		System.out.println(idsBuilder.toString());
		
		//part 10
		StringBuilder namesBuilder = new StringBuilder();
		
		//part 11
		for(String name : employeeNames) {
			namesBuilder.append(name).append(" ");
			
		//part 12
		System.out.println(namesBuilder.toString());
		}
	}

}

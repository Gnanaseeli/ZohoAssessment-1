package assessment;
import java.util.HashMap;
import java.util.Map;
public class Wordcount {
	public static void main(String[] args) {
		String[] input = {"Hello World Please","Help"};
		Map<String,Integer> m = new HashMap<String,Integer>();
		for (String i : input) {
			if (m.containsKey(i)) {
				int count = m.get(i) + 1;
				m.put(i, count);
			} else {
				m.put(i, 1);
			}
		}
				for (String temp : m.keySet()) {
			System.out.println("value " +temp + " is ocurred " +m.get(temp)+ " times");
		}
	}
}

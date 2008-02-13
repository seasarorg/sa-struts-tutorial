package tutorial.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.seasar.struts.annotation.Execute;

public class ForeachUpdateAction {

	public List<Map<String, Object>> mapItems = new ArrayList<Map<String, Object>>();

	@Execute(validator = false)
	public String index() {
		for (int i = 0; i < 10; i++) {
			Map<String, Object> m = new HashMap<String, Object>();
			m.put("id", i);
			m.put("name", "name" + i);
			mapItems.add(m);
		}
		return "foreachUpdate.jsp";
	}

	@Execute(validator = false)
	public String submit() {
		return "foreachUpdate.jsp";
	}
}

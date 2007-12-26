package tutorial.web.multiselect;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;

@Result(name = "multiselect", path = "/multiselect/multiselect.jsp")
public class MultiselectAction {

	public String[] select;

	@Execute(validator = false)
	public String execute() {
		select = new String[] { "2", "3" };
		return "multiselect";
	}

	@Execute(validator = false)
	public String submit() {
		return "multiselect";
	}

	public void reset() {
		select = new String[0];
	}
}
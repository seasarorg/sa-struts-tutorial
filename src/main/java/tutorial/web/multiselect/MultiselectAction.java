package tutorial.web.multiselect;

import java.util.Arrays;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;

@Result(path = "/multiselect/multiselect.jsp")
public class MultiselectAction {

	public String[] select;

	public String selectAsString;

	@Execute
	public String execute() {
		select = new String[] { "2", "3" };
		return "success";
	}

	@Execute
	public String submit() {
		selectAsString = Arrays.toString(select);
		return "success";
	}

	public void reset() {
		select = new String[0];
	}
}
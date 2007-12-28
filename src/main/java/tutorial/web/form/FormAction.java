package tutorial.web.form;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;
import org.seasar.struts.annotation.Results;

@Results( { @Result(name = "first", path = "/form/first.jsp"),
	@Result(name = "second", path = "/form/second.jsp"),
	@Result(name = "third", path = "/form/third.jsp") })
public class FormAction {

	@ActionForm
	public FormDto formDto;

	@Execute(validator = false)
	public String execute() {
		return "first";
	}

	@Execute(validator = false)
	public String goSecond() {
		return "second";
	}

	@Execute(validator = false)
	public String goThird() {
		return "third";
	}
}
package tutorial.web.validator;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class SecondAction {

	@ActionForm
	public ValidatorDto validatorDto;

	@Execute(input = "first.jsp")
	public String goSecond() {
		return "second.jsp";
	}
}
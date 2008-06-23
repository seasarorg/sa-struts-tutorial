package tutorial.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.dto.ClientValidatorDto;

public class ClientValidatorAction {

	@ActionForm
	@Resource
	protected ClientValidatorDto clientValidatorDto;

	@Execute(validator = false)
	public String index() {
		return "index.jsp";
	}

	@Execute(validator = true, input = "index.jsp")
	public String submit() {
		return "index.jsp";
	}

	@Execute(validator = true, input = "index.jsp")
	public String submit2() {
		return "index.jsp";
	}
}
package tutorial.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.dto.CheckboxDto;

public class CheckboxAction {

	@ActionForm
	@Resource
	protected CheckboxDto checkboxDto;

	@Execute(validator = false)
	public String index() {
		checkboxDto.initialize();
		return "index.jsp";
	}

	@Execute(validator = false)
	public String submit() {
		return "index.jsp";
	}
}
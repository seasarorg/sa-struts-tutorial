package tutorial.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.dto.ValidatorDto;

public class ValidatorAction {

	@ActionForm
	@Resource
	protected ValidatorDto validatorDto;

	@Execute(validator = false)
	public String index() {
		validatorDto.initialize();
		return "index.jsp";
	}

	@Execute(input = "index.jsp")
	public String submit() {
		return "index.jsp";
	}
}
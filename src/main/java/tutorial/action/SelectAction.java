package tutorial.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.dto.SelectDto;

public class SelectAction {

	@ActionForm
	@Resource
	protected SelectDto selectDto;

	@Execute(validator = false)
	public String index() {
		selectDto.initialize();
		return "index.jsp";
	}

	@Execute(validator = false)
	public String submit() {
		return "index.jsp";
	}
}
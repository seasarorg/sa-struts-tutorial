package tutorial.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.dto.AddDto;

public class AddAction {

	public Integer result;

	@ActionForm
	@Resource
	protected AddDto addDto;

	@Execute(validator = false)
	public String index() {
		return "index.jsp";
	}

	@Execute(input = "index.jsp")
	public String submit() {
		result = Integer.valueOf(addDto.arg1) + Integer.valueOf(addDto.arg2);
		return "index.jsp";
	}
}
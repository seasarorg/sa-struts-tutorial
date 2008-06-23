package tutorial.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.dto.RadioDto;

public class RadioAction {

	@ActionForm
	@Resource
	protected RadioDto radioDto;

	@Execute(validator = false)
	public String index() {
		radioDto.initialize();
		return "index.jsp";
	}

	@Execute(validator = false)
	public String submit() {
		return "index.jsp";
	}
}
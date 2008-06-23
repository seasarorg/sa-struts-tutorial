package tutorial.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.dto.MultiboxDto;

public class MultiboxAction {

	@ActionForm
	@Resource
	protected MultiboxDto multiboxDto;

	@Execute(validator = false)
	public String index() {
		multiboxDto.initialize();
		return "index.jsp";
	}

	@Execute(validator = false)
	public String submit() {
		return "index.jsp";
	}
}
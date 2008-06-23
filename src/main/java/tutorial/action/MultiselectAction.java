package tutorial.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.dto.MultiselectDto;

public class MultiselectAction {

	@ActionForm
	@Resource
	protected MultiselectDto multiselectDto;

	@Execute(validator = false)
	public String index() {
		multiselectDto.initialize();
		return "index.jsp";
	}

	@Execute(validator = false)
	public String submit() {
		return "index.jsp";
	}
}
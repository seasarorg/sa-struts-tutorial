package tutorial.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.dto.TextareaDto;

public class TextareaAction {

	@ActionForm
	@Resource
	protected TextareaDto textareaDto;

	@Execute(validator = false)
	public String index() {
		textareaDto.initialize();
		return "index.jsp";
	}

	@Execute(validator = false)
	public String submit() {
		return "index.jsp";
	}
}
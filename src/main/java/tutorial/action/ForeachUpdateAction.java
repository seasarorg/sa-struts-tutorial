package tutorial.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.dto.ForeachUpdateDto;

public class ForeachUpdateAction {

	@ActionForm
	@Resource
	protected ForeachUpdateDto foreachUpdateDto;

	@Execute(validator = false)
	public String index() {
		foreachUpdateDto.initialize();
		return "index.jsp";
	}

	@Execute(validator = false)
	public String submit() {
		return "index.jsp";
	}
}

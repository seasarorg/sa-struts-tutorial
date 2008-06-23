package tutorial.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.dto.NestedForeachUpdateDto;

public class NestedForeachUpdateAction {

	@ActionForm
	@Resource
	protected NestedForeachUpdateDto nestedForeachUpdateDto;

	@Execute(validator = false)
	public String index() {
		nestedForeachUpdateDto.initialize();
		return "index.jsp";
	}

	@Execute(validator = false)
	public String submit() {
		return "index.jsp";
	}
}
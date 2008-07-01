package tutorial.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.form.NestedForeachUpdateForm;

public class NestedForeachUpdateAction {

	@ActionForm
	@Resource
	protected NestedForeachUpdateForm nestedForeachUpdateForm;

	@Execute(validator = false)
	public String index() {
		nestedForeachUpdateForm.initialize();
		return "index.jsp";
	}

	@Execute(validator = false)
	public String submit() {
		return "index.jsp";
	}
}
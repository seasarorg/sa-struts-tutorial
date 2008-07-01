package tutorial.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.form.ForeachUpdateForm;

public class ForeachUpdateAction {

	@ActionForm
	@Resource
	protected ForeachUpdateForm foreachUpdateForm;

	@Execute(validator = false)
	public String index() {
		foreachUpdateForm.initialize();
		return "index.jsp";
	}

	@Execute(validator = false)
	public String submit() {
		return "index.jsp";
	}
}

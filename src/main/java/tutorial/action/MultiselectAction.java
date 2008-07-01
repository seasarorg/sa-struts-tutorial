package tutorial.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.form.MultiselectForm;

public class MultiselectAction {

	@ActionForm
	@Resource
	protected MultiselectForm multiselectForm;

	@Execute(validator = false)
	public String index() {
		multiselectForm.initialize();
		return "index.jsp";
	}

	@Execute(validator = false)
	public String submit() {
		return "index.jsp";
	}
}
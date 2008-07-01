package tutorial.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.form.MultiboxForm;

public class MultiboxAction {

	@ActionForm
	@Resource
	protected MultiboxForm multiboxForm;

	@Execute(validator = false)
	public String index() {
		multiboxForm.initialize();
		return "index.jsp";
	}

	@Execute(validator = false)
	public String submit() {
		return "index.jsp";
	}
}
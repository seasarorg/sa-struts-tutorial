package tutorial.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.dto.ConditionDto;

public class ConditionAction {

	@ActionForm
	@Resource
	protected ConditionDto conditionDto;

	@Execute(validator = false, urlPattern = "{id}")
	public String index() {
		return "index.jsp";
	}
}
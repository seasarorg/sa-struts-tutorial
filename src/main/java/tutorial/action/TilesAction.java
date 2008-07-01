package tutorial.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.form.TilesForm;

public class TilesAction {

	@ActionForm
	@Resource
	protected TilesForm tilesForm;

	@Execute(validator = false)
	public String index() {
		return "index.jsp";
	}
}
package tutorial.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.dto.TilesDto;

public class TilesAction {

	@ActionForm
	@Resource
	protected TilesDto tilesDto;

	@Execute(validator = false)
	public String index() {
		return "index.jsp";
	}
}
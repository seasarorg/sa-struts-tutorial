package tutorial.action;

import org.seasar.struts.annotation.Execute;

public class TilesAction {

	public String name = "Seasar2";

	@Execute(validator = false)
	public String index() {
		return "index.jsp";
	}
}
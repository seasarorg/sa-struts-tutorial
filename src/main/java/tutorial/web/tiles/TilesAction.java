package tutorial.web.tiles;

import org.seasar.struts.annotation.Execute;

public class TilesAction {

	public String name = "seasar";

	@Execute(validator = false)
	public String execute() {
		return "tiles.jsp";
	}
}
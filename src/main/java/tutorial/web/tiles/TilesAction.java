package tutorial.web.tiles;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;

@Result(name = "tiles", path = "/tiles/tiles.jsp")
public class TilesAction {

	public String name = "seasar";

	@Execute(validator = false)
	public String execute() {
		return "tiles";
	}
}
package tutorial.action;

import org.seasar.struts.annotation.Execute;

public class ErrorAction {

	@Execute(validator = false)
	public String index() {
		throw new NullPointerException("hoge");
	}
}
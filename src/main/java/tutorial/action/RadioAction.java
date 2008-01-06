package tutorial.action;

import org.seasar.struts.annotation.Execute;

public class RadioAction {

	public String radio;

	@Execute(validator = false)
	public String index() {
		radio = "3";
		return "radio.jsp";
	}

	@Execute(validator = false)
	public String submit() {
		return "radio.jsp";
	}
}
package tutorial.web.radio;

import org.seasar.struts.annotation.Execute;

public class RadioAction {

	public String radio;

	@Execute(validator = false)
	public String execute() {
		radio = "3";
		return "radio.jsp";
	}

	@Execute(validator = false)
	public String submit() {
		return "radio.jsp";
	}
}
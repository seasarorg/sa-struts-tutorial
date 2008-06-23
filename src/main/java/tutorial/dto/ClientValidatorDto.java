package tutorial.dto;

import org.seasar.struts.annotation.Required;

public class ClientValidatorDto {

	@Required(target = "submit")
	public String aaa;

	@Required(target = "submit2")
	public String bbb;
}
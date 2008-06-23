package tutorial.dto;

import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Required;

public class AddDto {

	@Required
	@IntegerType
	public String arg1;

	@Required
	@IntegerType
	public String arg2;
}

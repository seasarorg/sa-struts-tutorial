package tutorial.dto;

import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Required;

public class EmployeeDto {

	@Required
	@IntegerType
	public String id;

	@Required
	public String name;

	@Required
	public String jobType;

	@IntegerType
	public String salary;

	@IntegerType
	public String departmentId;

	@Required
	@IntegerType
	public String version;
}
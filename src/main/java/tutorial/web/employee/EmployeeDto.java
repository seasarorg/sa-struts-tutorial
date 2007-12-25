package tutorial.web.employee;

import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Required;

public class EmployeeDto {

	@Required
	@IntegerType
	public String id;

	@Required(target = "confirm, store")
	public String name;

	@Required(target = "confirm, store")
	public String jobType;

	@IntegerType
	public String salary;

	@IntegerType
	public String departmentId;

	@Required(target = "confirm, store")
	@IntegerType
	public String version;
}
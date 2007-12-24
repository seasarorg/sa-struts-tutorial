package tutorial.web.employee;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;
import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Required;

@Component(instance = InstanceType.SESSION)
public class EmployeeDto implements Serializable {

	private static final long serialVersionUID = 1L;

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
	public String department$id;

	@Required(target = "confirm, store")
	@IntegerType
	public String version;
}
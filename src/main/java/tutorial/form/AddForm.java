package tutorial.form;

import java.io.Serializable;

import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Required;

//@Component(instance = InstanceType.SESSION)
public class AddForm implements Serializable {

    private static final long serialVersionUID = 1L;

    @Required
    @IntegerType
    public String arg1;

    @Required
    @IntegerType
    public String arg2;
}

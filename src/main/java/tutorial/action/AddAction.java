package tutorial.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.exception.ActionMessagesException;

import tutorial.form.AddForm;

public class AddAction {

    public Integer result;

    @ActionForm
    @Resource
    protected AddForm addForm;

    @Execute(validator = false)
    public String index() {
        return "index.jsp";
    }

    @Execute(input = "index.jsp", removeActionForm = true)
    public String submit() {
        result = Integer.valueOf(addForm.arg1) + Integer.valueOf(addForm.arg2);
        throw new ActionMessagesException("errors.required", "hoge");
        // return "index.jsp";
    }
}
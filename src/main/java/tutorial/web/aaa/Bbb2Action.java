package tutorial.web.aaa;

import java.util.List;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;

@Result(path = "/aaa/bbb.jsp")
public class Bbb2Action {

	public String name;

	public List<Hoge> hogeList;

	public List<List<Hoge>> hogeListList;

	@Execute
	public String execute() {
		return "success";
	}
}

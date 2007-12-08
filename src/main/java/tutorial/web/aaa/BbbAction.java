package tutorial.web.aaa;

import java.util.ArrayList;
import java.util.List;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;

@Result(path = "/aaa/bbb.jsp")
public class BbbAction {

	public String name = "Seasar2";

	public int index = 10;

	public List<Hoge> hogeList;

	public List<List<Hoge>> hogeListList;

	@Execute
	public String execute() {
		hogeList = new ArrayList<Hoge>();
		for (int i = 0; i < 10; i++) {
			Hoge hoge = new Hoge();
			hoge.aaa = "aaa" + i;
			hoge.bbb = "bbb" + i;
			hogeList.add(hoge);
		}
		hogeListList = new ArrayList<List<Hoge>>();
		for (int i = 0; i < 10; i++) {
			List<Hoge> l = new ArrayList<Hoge>();
			for (int j = 0; j < 2; j++) {
				Hoge hoge = new Hoge();
				hoge.aaa = "aaa" + i + j;
				hoge.bbb = "bbb" + i + j;
				l.add(hoge);
			}
			hogeListList.add(l);
		}
		return "success";
	}
}

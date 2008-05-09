package tutorial.action;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.seasar.framework.exception.IORuntimeException;
import org.seasar.struts.annotation.Execute;

public class DownloadAction {

	public String message;

	public HttpServletResponse response;

	@Execute(validator = false)
	public String index() {
		return "index.jsp";
	}

	@Execute(validator = false)
	public String download() {
		try {
			response.setContentType("application/octet-stream");
			response.setHeader("Content-disposition", "attachment; filename=\""
				+ new String("サンプル.txt".getBytes("Shift_JIS"), "ISO-8859-1")
				+ "\"");
			PrintWriter out = new PrintWriter(new OutputStreamWriter(response
				.getOutputStream()));
			try {
				out.print("こんにちは");
			} finally {
				out.close();
			}
		} catch (IOException e) {
			throw new IORuntimeException(e);
		}
		return null;
	}
}
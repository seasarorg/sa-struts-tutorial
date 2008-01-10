package tutorial.action;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletContext;

import org.apache.struts.upload.FormFile;
import org.seasar.framework.container.annotation.tiger.Binding;
import org.seasar.framework.container.annotation.tiger.BindingType;
import org.seasar.framework.exception.IORuntimeException;
import org.seasar.framework.util.OutputStreamUtil;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Required;
import org.seasar.struts.util.MessageResourcesUtil;

public class UploadAction {

	@Required
	@Binding(bindingType = BindingType.NONE)
	public FormFile formFile;

	public String message;

	public ServletContext application;

	@Execute(validator = false)
	public String index() {
		return "upload.jsp";
	}

	@Execute(input = "upload.jsp")
	public String upload() {
		String path = application.getRealPath("/WEB-INF/work/"
			+ formFile.getFileName());
		try {
			OutputStream out = new BufferedOutputStream(new FileOutputStream(
				path));
			try {
				out.write(formFile.getFileData(), 0, formFile.getFileSize());
			} finally {
				OutputStreamUtil.close(out);
			}
		} catch (IOException e) {
			throw new IORuntimeException(e);
		}
		message = MessageResourcesUtil.getMessageResources().getMessage(
			"messages.upload.complete",
			path);
		return "upload.jsp";
	}
}
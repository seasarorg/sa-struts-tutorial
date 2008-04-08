package tutorial.action;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileUploadBase.SizeLimitExceededException;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.upload.FormFile;
import org.seasar.framework.container.annotation.tiger.Binding;
import org.seasar.framework.container.annotation.tiger.BindingType;
import org.seasar.framework.exception.IORuntimeException;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Required;
import org.seasar.struts.upload.S2MultipartRequestHandler;
import org.seasar.struts.util.ActionMessagesUtil;

public class UploadAction {

	@Required
	@Binding(bindingType = BindingType.NONE)
	public FormFile formFile;

	@Binding(bindingType = BindingType.NONE)
	public FormFile[] formFiles;

	public HttpServletRequest request;

	public ServletContext application;

	@Execute(validator = false)
	public String index() {
		SizeLimitExceededException e = (SizeLimitExceededException) request
			.getAttribute(S2MultipartRequestHandler.SIZE_EXCEPTION_KEY);
		if (e != null) {
			ActionMessages errors = new ActionMessages();
			errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
				"errors.upload.size",
				new Object[] { e.getPermittedSize(), e.getActualSize() }));
			ActionMessagesUtil.addErrors(request, errors);
		}
		return "upload.jsp";
	}

	@Execute(input = "upload.jsp")
	public String upload() {
		ActionMessages messages = new ActionMessages();
		upload(formFile, messages);
		for (FormFile file : formFiles) {
			upload(file, messages);
		}
		ActionMessagesUtil.addMessages(request, messages);
		return "upload.jsp";
	}

	protected void upload(FormFile file, ActionMessages messages) {
		if (file.getFileSize() == 0) {
			return;
		}
		String path = application.getRealPath("/WEB-INF/work/"
			+ file.getFileName());
		try {
			OutputStream out = new BufferedOutputStream(new FileOutputStream(
				path));
			try {
				out.write(file.getFileData(), 0, file.getFileSize());
			} finally {
				out.close();
			}
		} catch (IOException e) {
			throw new IORuntimeException(e);
		}
		messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
			"messages.upload.complete",
			new Object[] { path }));
	}
}
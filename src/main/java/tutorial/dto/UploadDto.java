package tutorial.dto;

import org.apache.struts.upload.FormFile;
import org.seasar.struts.annotation.Required;

public class UploadDto {

	@Required
	public FormFile formFile;

	public FormFile[] formFiles;
}
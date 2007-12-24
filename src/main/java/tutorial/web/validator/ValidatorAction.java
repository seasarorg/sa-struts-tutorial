package tutorial.web.validator;

import org.seasar.struts.annotation.Arg;
import org.seasar.struts.annotation.ByteType;
import org.seasar.struts.annotation.CreditCardType;
import org.seasar.struts.annotation.DateType;
import org.seasar.struts.annotation.DoubleRange;
import org.seasar.struts.annotation.DoubleType;
import org.seasar.struts.annotation.EmailType;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.FloatRange;
import org.seasar.struts.annotation.FloatType;
import org.seasar.struts.annotation.Input;
import org.seasar.struts.annotation.IntRange;
import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.LongRange;
import org.seasar.struts.annotation.LongType;
import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Maxbytelength;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Minbytelength;
import org.seasar.struts.annotation.Minlength;
import org.seasar.struts.annotation.Msg;
import org.seasar.struts.annotation.Required;
import org.seasar.struts.annotation.Result;
import org.seasar.struts.annotation.ShortType;
import org.seasar.struts.annotation.UrlType;
import org.seasar.struts.annotation.Validwhen;

@Result(path = "/validator/validator.jsp")
@Input(path = "/validator/validator.jsp")
public class ValidatorAction {

	@Required(target = "submit")
	@ByteType
	public String byteText;

	@Required(target = "submit")
	@ShortType
	public String shortText;

	@Required(target = "submit")
	@IntegerType
	public String integerText;

	@Required(target = "submit")
	@LongType
	public String longText;

	@Required(target = "submit")
	@FloatType
	public String floatText;

	@Required(target = "submit")
	@DoubleType
	public String doubleText;

	@Required(target = "submit")
	@DateType
	public String dateText;

	@Required(target = "submit")
	@CreditCardType
	public String creditcardText;

	@Required(target = "submit")
	@EmailType
	public String emailText;

	@Required(target = "submit")
	@UrlType
	public String urlText;

	@Required(target = "submit")
	@IntRange(min = 3, max = 10)
	public String intRangeText;

	@Required(target = "submit")
	@LongRange(min = 3, max = 10)
	public String longRangeText;

	@Required(target = "submit")
	@FloatRange(min = "3.0", max = "10.0")
	public String floatRangeText;

	@Required(target = "submit")
	@DoubleRange(min = "3.0", max = "10.0")
	public String doubleRangeText;

	@Required(target = "submit")
	@Minlength(minlength = 3)
	public String minlengthText;

	@Required(target = "submit")
	@Maxlength(maxlength = 10)
	public String maxlengthText;

	@Required(target = "submit")
	@Minbytelength(minbytelength = 3)
	public String minbytelengthText;

	@Required(target = "submit")
	@Maxbytelength(maxbytelength = 10)
	public String maxbytelengthText;

	@Required(target = "submit")
	@Mask(mask = "\\d\\d-\\d\\d\\d\\d-\\d\\d\\d\\d", msg = @Msg(key = "errors.phone"))
	public String phoneText;

	public String validwhen1Text;

	@Validwhen(test = "((validwhen1Text == null) or (*this* != null))", msg = @Msg(key = "errors.required.other"), args = @Arg(key = "validwhen1Text", resource = false, position = 1))
	public String validwhen2Text;

	@Execute
	public String execute() {
		byteText = "1";
		shortText = "1";
		integerText = "1";
		longText = "1";
		floatText = "1.0";
		doubleText = "1.0";
		dateText = "2008/1/1";
		emailText = "higayasuo@gmail.com";
		urlText = "http://d.hatena.ne.jp/higayasuo";
		intRangeText = "7";
		longRangeText = "7";
		floatRangeText = "7.0";
		doubleRangeText = "7.0";
		minlengthText = "123";
		maxlengthText = "1234567890";
		minbytelengthText = "ああ";
		maxbytelengthText = "あああああ";
		phoneText = "03-9999-9999";
		return "success";
	}

	@Execute
	public String submit() {
		return "success";
	}
}
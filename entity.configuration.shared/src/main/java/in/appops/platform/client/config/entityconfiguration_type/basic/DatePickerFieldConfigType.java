package in.appops.platform.client.config.entityconfiguration_type.basic;

import in.appops.client.common.config.field.date.DatePickerField.DatePickerConstant;
import in.appops.platform.client.config.client_type.DatePickerFieldConfig;

/**
 * @author pallavi@ensarm.com
 * @createdOn 12-Nov-2013
 */

@SuppressWarnings("serial")
public class DatePickerFieldConfigType extends BaseFieldConfigType{
	
	public static final String DP_BXPCLS = "dateBoxPrimaryCss";
	public static final String DP_BXDCLS = "dateBoxDependentCss";
	public static final String DP_MAXDATE = "maxDate";
	public static final String DP_MINDATE = "minDate";
	public static final String DP_FORMAT = "format";
	public static final String DP_ALTFORMAT= "altformat";
	public static final String DP_ALLOWBLNK = "allowBlank";
	public static final String DP_ERRMSGBLNK = "blnktxt";
	public static final String DP_ERRMSGMIN = "minText";
	public static final String DP_ERRMSGMAX = "maxText";
	
	public static final String	DATEPICKERCONFIG		= "DatePickerFieldConfig";
	
	public DatePickerFieldConfigType() {
		setParentConfigtype(DATEPICKERCONFIG, false, this.getClass(), IntellithoughtFieldConfigType.class, DatePickerFieldConfig.class);
		addProperty(BF_DEFVAL, "01.07.2013", false, null, null, null);
		addProperty(DP_MAXDATE, "03.08.2013", false, null, null, null);
		addProperty(DP_MINDATE, "05.06.2013", false, null, null, null);
		addProperty(DP_FORMAT, "dd.MM.yyyy", false, null, null, null);
		addProperty(DP_ALLOWBLNK, false, false, null, null, null);
		addProperty(BF_ERRPOS, DatePickerConstant.BF_BOTTOM, false, null, null, null);
	}

}
package in.appops.platform.client.config.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.SpinnerFieldConfig;

/**
 * @author pallavi@ensarm.com
 * @createdOn 12-Nov-2013
 */

@SuppressWarnings("serial")
public class SpinnerFieldConfigType extends BaseFieldConfigType{
	
	public static final String SP_TYPE = "spinnerType";
	public static final int SP_TYPENUMERIC = 1;
	public static final int SP_TYPELIST = 2;
	public static final String SP_STEP = "step";
	public static final String SP_UNIT = "unit";
	public static final String SP_CIRCULAR = "circular";
	public static final String SP_ALLOWBLNK = "allowBlank";
	public static final String SP_ALLOWDEC = "allowDecimal";
	public static final String SP_ERRMSGMAX = "maxMsg";
	public static final String SP_ERRMSGMIN = "minMsg";
	public static final String SP_ERRMSGNEG = "negMsg";
	public static final String SP_ERRMSGBLNK = "blankMsg";
	public static final String SP_ERRMSGINVLD = "invalidMsg";
	public static final String SP_VALUELIST = "valueList";
	public static final String SP_VALUEIDX = "valueListIndex";
	
	public static final String	SPINNERCONFIG		= "SpinnerFieldConfig";
	
	public SpinnerFieldConfigType() {
		setParentConfigtype(SPINNERCONFIG, false, this.getClass(), null, SpinnerFieldConfig.class);
		addProperty(SP_TYPE, SP_TYPENUMERIC, false, null, null, null);
		addProperty(SP_STEP, 3, false, null, null, null);
		addProperty(SP_UNIT, "%", false, null, null, null);
		addProperty(SP_CIRCULAR, true, false, null, null, null);
		addProperty(BF_DEFVAL, 3F, false, null, null, null);
		addProperty(BF_ERRPOS, BF_BOTTOM, false, null, null, null);
		addProperty(SP_ALLOWDEC, false, false, null, null, null);
		addProperty(BF_VALIDATEONCHANGE, true, false, null, null, null);
	}
	

}
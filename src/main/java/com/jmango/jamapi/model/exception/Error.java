package com.jmango.jamapi.model.exception;

public class Error {

	public static final int CODE_OK = 0;
	public static final int CODE_MAGENTO_CONFIG = 1;
	public static final int CODE_MAGENTO_CONNECT = 2;
	public static final int CODE_MAGENTO_GET_STORES = 3;
	public static final int CODE_MAGENTO_CHECK_PLUGIN = 4;
	public static final int CODE_CREATE_MAGENTO_APP = 5;
	public static final int CODE_UPDATE_MAGENTO_APP = 6;
	public static final int CODE_MAGENTO_IMPORT_INFO_PAGES = 7;
	public static final int CODE_MAGENTO_IMPORT_ROOT_CATEGORIES = 8;
	public static final int CODE_MAGENTO_IMPORT_PRODUCTS = 9;
	public static final int CODE_MAGENTO_GET_SETTINGS = 10;
	public static final int CODE_MAGENTO_GET_USERS = 11;

	public static final int CODE_CREATE_APP = 11;

	public static final int CODE_AUTHENTICATION_FAILED = 401;
	public static final int CODE_GENERAL = 500;

	public static final int UNDEFINED_ERROR = 400;

	public static final Error OK = new Error(0, "OK");

	private int code;
	private String message;

	public Error() {
	}

	public Error(int c, String m) {
		code = c;
		message = m;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static String defaultMessage() {
		return "The system encountered an error. Please contact us for support.";
	}
}

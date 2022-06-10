package com.jmango.jamapi.model.req;

public class CreateAppRequest extends Request {

	private String templateAppKey;
	private String appName;

	public CreateAppRequest() {
		super();
	}

	public String getTemplateAppKey() {
		return templateAppKey;
	}

	public void setTemplateAppKey(String templateAppKey) {
		this.templateAppKey = templateAppKey;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
}
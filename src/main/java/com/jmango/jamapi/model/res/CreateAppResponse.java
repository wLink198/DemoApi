package com.jmango.jamapi.model.res;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateAppResponse extends Response {
	private String appKey;

	public CreateAppResponse() {
		super();
	}

	public CreateAppResponse(String appKey) {
		this.appKey = appKey;
	}

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}
}
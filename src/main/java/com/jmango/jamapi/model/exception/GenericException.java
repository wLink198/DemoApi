package com.jmango.jamapi.model.exception;

import java.io.Serializable;

public class GenericException extends Exception implements Serializable {

	private static final long serialVersionUID = -8799943538050833178L;

	public GenericException() {
		super();
	}

	public GenericException(String message) {
		super(message!=null ? message : "The system encountered an error. Please contact us for support.");
	}
}
package com.lob.exception;

public class APIException extends LobException {

	private static final long serialVersionUID = 1L;

	public APIException(String message, Throwable e) {
		super(message, e);
	}

}

package com.valdoc.exception;

public class ServiceException extends ValdocException {

	private static final long serialVersionUID = 1L;

	private String message = null;

	public ServiceException() {
	}

	public ServiceException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {

		return super.getMessage() + this.message;
	}

}

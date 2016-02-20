package com.valdoc.exception;

public class ValdocException extends Exception {

	private static final long serialVersionUID = 1L;

	private String message = null;

	public ValdocException() {

	}

	public ValdocException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {

		return super.getMessage() + this.message;
	}

	public String getErrorMessage() {
		return this.message;
	}

	public String getErrorCode() {
		return "default";
	}

}

package com.valdoc.exception;

@SuppressWarnings("serial")
public class DaoException extends ValdocException {

	private String message = null;

	public DaoException() {
	}

	public DaoException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {

		return super.getMessage() + this.message;
	}

}

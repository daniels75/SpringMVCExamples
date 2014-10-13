package org.daniels.examples.exceptions;

public class SampleSpringException extends RuntimeException {

	private String exceptionMsg;

	public SampleSpringException(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}

	public String getExceptionMsg() {
		return this.exceptionMsg;
	}

	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}
}
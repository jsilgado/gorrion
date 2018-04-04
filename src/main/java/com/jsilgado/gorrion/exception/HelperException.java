package com.jsilgado.gorrion.exception;

public class HelperException extends GeneralException {

	private static final long serialVersionUID = -2133071948635914544L;

	public HelperException() {
		super();
	}

	public HelperException( final String description ) {
		super( "500", description );
	}

	public HelperException( final String codeError, final String description ) {
		super( codeError, description );
	}

}

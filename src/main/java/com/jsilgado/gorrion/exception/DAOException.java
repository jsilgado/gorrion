package com.jsilgado.gorrion.exception;

public class DAOException extends GeneralException {

	private static final long serialVersionUID = -8791974827025573797L;

	public DAOException() {
		super();
	}

	public DAOException( final String codeError, final String description ) {
		super( codeError, description );
	}

	public DAOException( final String codeError, final String description, final Exception e ) {
		super( codeError, description );
		setStackTrace( e.getStackTrace() );
	}
}

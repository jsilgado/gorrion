package com.jsilgado.gorrion.exception;

/**
 * Excepción general para la capa BL
 *
 *
 * @author jvenegas
 * @version 1.0
 * @created: 18/12/2012
 */
public class BusinessException extends GeneralException {

	private static final long serialVersionUID = -5358067340118953046L;

	public BusinessException() {
		super();
	}

	public BusinessException( final String codeError, final String description ) {
		super( codeError, description );
	}

	public BusinessException( final DAOException exception ) {
		super( exception.getCodeError(), exception.getDescription() );
		setStackTrace( exception.getStackTrace() );
	}

	public BusinessException( final Exception exception ) {
		super( exception.getCause() != null ? exception.getCause().toString() : null, exception.getMessage() );
	}

	public BusinessException( final String codeError, final String description, final DAOException e ) {
		super( codeError, description );
		setStackTrace( e.getStackTrace() );
	}

	public BusinessException( final String codeError, final String description, final Exception e ) {
		super( codeError, description );
		setStackTrace( e.getStackTrace() );
	}
}

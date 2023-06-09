package test.prueba.curso.alternativo.dto;

import java.io.Serializable;

public class ResponseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String success;
	private String message;
	
	

	public ResponseDTO(String success, String message) {
		super();
		this.success = success;
		this.message = message;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

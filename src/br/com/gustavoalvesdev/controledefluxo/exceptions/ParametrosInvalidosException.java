package br.com.gustavoalvesdev.controledefluxo.exceptions;

public class ParametrosInvalidosException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
	
}

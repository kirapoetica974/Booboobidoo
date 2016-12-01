package exceptions;

public class ExceptionVetementNonTrouve extends Exception {

	private final String message;

    public ExceptionVetementNonTrouve(Exception e) {
        message = e.getMessage();
    }

    public ExceptionVetementNonTrouve(String message) {
        this.message = message;
    }
    
    @Override
    public String getMessage() {
        return message;
    }
}

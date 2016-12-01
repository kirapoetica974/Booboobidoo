package exceptions;

public class ExceptionPasEnStock extends Exception {
	
	private final String message;

    public ExceptionPasEnStock(Exception e) {
        message = e.getMessage();
    }

    public ExceptionPasEnStock(String message) {
        this.message = message;
    }
    
    @Override
    public String getMessage() {
        return message;
}
}

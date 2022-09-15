
public class BadBadBalueException extends Exception {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BadBadBalueException(String e) {
		super(e);
	}
	
	public BadBadBalueException() {
		
		super("cannot have a negative value");
	}
	


}

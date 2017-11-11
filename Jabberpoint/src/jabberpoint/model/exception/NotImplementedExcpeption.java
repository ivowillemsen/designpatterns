package jabberpoint.model.exception;

public class NotImplementedExcpeption extends RuntimeException {

    /**
     * Default constructor
     */
    public NotImplementedExcpeption() {

        super();
        System.exit(1);
    }

    /**
     * Constructor that takes a messages as a parameter
     * @param message the message that should be included in the stacktrace
     */
    public NotImplementedExcpeption(String message) {

        super(message);
        System.exit(1);

    }

}

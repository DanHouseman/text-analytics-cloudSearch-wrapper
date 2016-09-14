package cloudSearch;

/**
 * Created by dan.houseman on 9/14/16.
 */

public class ServerException extends Exception {
    private static final long serialVersionUID = -6321292963167579340L;

    public ServerException(Throwable t) {
        super(t);
    }

    public ServerException(String message, Throwable t) {
        super(message, t);
    }

    public ServerException(String message) {
        super(message);
    }
}
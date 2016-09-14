package cloudSearch;

/**
 * Created by dan.houseman on 9/14/16.
 */

public class RequestException extends Exception {
    private static final long serialVersionUID = -8012139351879601142L;
    public String response;
    public String request;

    public RequestException(Throwable t) {
        super(t);
    }

    public RequestException(String message, Throwable t) {
        super(message, t);
    }

    public RequestException(String message) {
        super(message);
    }

    public RequestException(String request, String response) {
        super(response);
        this.request = request;
        this.response = response;
    }
}
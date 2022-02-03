package se.zw.reddit.exception;

public class SpringRedditException extends RuntimeException {

    public SpringRedditException(String msg, Exception e) {
        super(msg, e);
    }

    public SpringRedditException(String msg) {
        super(msg);
    }
}

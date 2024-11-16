package chess;

public class ChessException extends RuntimeException {
    public static final long serialVersionUID = 1l;

    public ChessException(String message) {
        super(message);
    }
}

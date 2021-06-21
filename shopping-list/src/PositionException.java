public class PositionException extends Exception {
    public PositionException(){
    }

    public PositionException(String message){
        super(message);
    }

    public PositionException(String message, Throwable cause){
        super(message, cause);
    }

    public PositionException(Throwable cause){
        super(cause);
    }
}

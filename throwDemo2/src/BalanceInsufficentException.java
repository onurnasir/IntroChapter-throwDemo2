// Kendi exception oluşturmak için bu class ekledik.

public class BalanceInsufficentException extends Exception {
    String message;
    public BalanceInsufficentException(String message){
        this.message=message;
    }
    @Override
    public String getMessage() {
        //return super.getMessage();
        return this.message;
    }
}

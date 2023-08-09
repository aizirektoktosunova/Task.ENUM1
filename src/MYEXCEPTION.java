public class MYEXCEPTION extends RuntimeException {
    public MYEXCEPTION() {
        System.out.println("мындай кун жок");
    }

    public MYEXCEPTION(String message){
        super(message);
    }
}

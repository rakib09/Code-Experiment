package execption;

public class MyCustomException {
    static class CustomException extends Exception {
        public CustomException(String str) {
            super(str);
        }
    }
    public static void main(String[] args) {
        try {
            throw new CustomException("Caught !!");
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
}

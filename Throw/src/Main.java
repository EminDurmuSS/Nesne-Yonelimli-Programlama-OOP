public class Main {
    public static void main(String[] args) {


    }
    public int indexOf(String value, String searchedText) throws BatuxException {

        if(value == null) {
            throw new BatuxException("Gelen değer null olamaz!");
        }

        return value.indexOf(searchedText);
    }
}
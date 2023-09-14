public class throw1 {
// throw keyword is used to throw exception by creating an exception.
    public static void main(String[] args) {
        
        try{
            throw new ArrayIndexOutOfBoundsException("something want wrong..");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

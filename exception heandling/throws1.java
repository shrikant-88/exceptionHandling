public class throws1 {
    static void A() throws Exception{
        System.out.println(10/0);
    }
    static void B(){
       try{
        A();
       } 
       catch(Exception e){
          System.out.println("something want wrong .."); 
       }
    }

    public static void main(String[] args) {
        B();
        System.out.println("code completely compiled");
    }
}

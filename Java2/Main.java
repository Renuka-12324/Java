public class Main {
    static void myMethod(String fname) {
      System.out.println(fname + " chama\n");
    }


     //Multiple parameters
     static void myMethod1(String fname, int age) {

        System.out.println(fname + " is " + age);
      }


      //if-else using methods
      static void checkAge(int age){
        if (age<18){
            System.out.println("Not eligible to vote\n");
        }
        else{
            System.out.println("Eligible to vote\n");
        }
      }
  
    public static void main(String[] args) {
      myMethod("Renuka");
      myMethod("Anu");
      myMethod1("Sai",5);
      myMethod1("Sam",10);

      checkAge(20);
    }
}

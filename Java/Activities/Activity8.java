package Activities;

public class Activity8 {
    public static void main(String[] a){
        try {
            // exceptionTest method call with a non null String
            Activity8.exceptionTest("Will print to console");
            // exceptionTest method call with a null string argument
            Activity8.exceptionTest(null); // in this line, custom exception will be thrown and control will move to catch block
            Activity8.exceptionTest("Won't execute");
        } catch(CustomException ce) {
            System.out.println("Inside catch block: " + ce.getMessage());
        }
    }

    static void exceptionTest(String str) throws CustomException {
        if(str == null) {
            throw new CustomException("Value of the passed String is null");
        } else {
            System.out.println(str);
        }
    }
}

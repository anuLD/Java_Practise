package exceptions;

class EC0 extends Exception
    {}
    class EC1 extends EC0 {}
    public class ExceptionHierarchy {
        public static void main(String[] args) {
            try {
                throw new EC1();
            } catch (EC0 e) {
                System.out.println("Exception");
            } catch (Exception e) {
                System.out.println("my exp");
            }
        }
    }


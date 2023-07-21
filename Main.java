public class Main {
        public static void main(String[] args) {
            if (check(103,99)) System.out.println("The equipment works fine");
            else System.out.println("The equipment doesn't work fine");

        }
        public static boolean check(int temperature1, int temperature2){
            if (temperature1>100 && temperature2<100) return true;
            else return false;
        }


    }


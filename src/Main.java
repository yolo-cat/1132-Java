public class Main {
        public static void main(String[] args) {
            Student tom = new Student("Tom", "Male", 30);
            Student chen = new Student("Tom", "Male", 30);

            System.out.println(tom == chen);
            System.out.println(tom.equals(chen));
            String tomString = tom.toString();
            System.out.println(tomString);
        }
    }
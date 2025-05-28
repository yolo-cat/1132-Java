//import java.util.Date;

public class Main {
    public static void main(String[] args) {

//        使用Circle類別
        Circle circle = new Circle(5.0, 0.0, 0.0);
        System.out.println("圓的半徑: " + circle.getRadius());
        System.out.println("圓心的x座標: " + circle.getX());
        System.out.println("圓心的y座標: " + circle.getY());
        circle.setRadius(10.0);
        System.out.println("更新後的圓的半徑: " + circle.getRadius());
        circle.setX(2.0);
        System.out.println("更新後的圓心的x座標: " + circle.getX());
        circle.setY(3.0);
        System.out.println("更新後的圓心的y座標: " + circle.getY());

    }
}
        //        // Create a new Person object
//        Person Tom = new Person("1", "Tom");
//        // Set the email, birthday, and address
//        Tom.setBirthday(new Date());
//        Tom.setAddress("台北市");
//        // Print the person's information，並在最後用水平分隔線
//        System.out.println("ID: " + Tom.getId());
//        System.out.println("Name: " + Tom.getName());
//        System.out.println("Email: " + Tom.getEmail());
//        System.out.println("Birthday: " + Tom.getBirthday());
//        System.out.println("Address: " + Tom.getAddress());
//        System.out.println("--------------------------------------------------");
//        // Print the person's eating behavior
//        System.out.println(Tom.eat());
//        System.out.println("--------------------------------------------------");
//
//
//        建立新學生身份"Katty"
//        Students Katty = new Students("2", "Katty", "A123456789", "國立中興大學", "資訊工程學系");
//        // 設定學生的 email, birthday, address
//        Katty.setEmail("katty@edu.tw");
//        Katty.setBirthday(new Date());
//        Katty.setAddress("台中市");
//        // 印出學生的資訊
//        System.out.println("ID: " + Katty.getId());
//        System.out.println("Name: " + Katty.getName());
//        System.out.println("Email: " + Katty.getEmail());
//        System.out.println("Birthday: " + Katty.getBirthday());
//        System.out.println("Address: " + Katty.getAddress());
//        System.out.println("Student ID: " + Katty.getStudentId());
//        System.out.println("School: " + Katty.getSchool());
//        System.out.println("Department: " + Katty.getDepartment());
//        System.out.println("--------------------------------------------------");
//        // 印出學生的吃飯行為
//        System.out.println(Katty.eat());
//        System.out.println("--------------------------------------------------");
//
//      使用override的eat()方法
//        System.out.println(Tom.eat());
//        System.out.println(Katty.eat());
//        System.out.println("--------------------------------------------------");



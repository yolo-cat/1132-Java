import java.util.Date;

public class Person {

    private String id;
    private String name;
    private String email;
    private Date birthday;
    private String address;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    人名+"去吃飯“
    public String eat() {
        return name + "去吃飯";
    }
//    email+"已登記"
    public String register() {
        return email + "已登記";
    }
}


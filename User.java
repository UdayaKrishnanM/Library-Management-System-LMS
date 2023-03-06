public class User {
    
    private String name;
    private String email;
    private String phoneNumber;

    public User(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String phoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: "+ name +"/ EMAIL: "+email+"/ Phone Number : "+ phoneNumber;
    }
}

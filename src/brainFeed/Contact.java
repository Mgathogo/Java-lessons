package brainFeed;

public class Contact {
    private String name;
    private String address;
    private String email;
    private String phone;

    public Contact(String name, String address, String 
    email, String phone){
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }

    public String setName(String name){
        return (this.name = name);
    }

    public String getAddress() {
        return this.address;
    }

    public String setAddress(String address){
        return (this.address = address);
    }

    public String getEmail() {
        return this.email;
    }

    public String setEmail(String email){
        return (this.email = email);
    }

    public String getPhone() {
        return this.phone;
    }

    public String setPhone(String phone){
        return (this.phone = phone);
    }

   

public void viewContacts() {
System.out.println(this.getName());
System.out.println(this.getAddress());
System.out.println(this.getEmail());
System.out.println(this.getPhone());

}
}
public class Contact {
    public String name;
    public String phone;
    public String email;
    public Contact next;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.next = null;
    }
}

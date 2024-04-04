public class ContactBook {
    private Contact head;

    public ContactBook() {
        head = null;
    }

    public void addContact(String name, String phone, String email) {
        Contact newContact = new Contact(name, phone, email);
        if (head == null) {
            head = newContact;
        } else {
            Contact temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newContact;
        }
        System.out.println("Contact added successfully!");
    }

    public void deleteContact(String name) {
        if (head == null) {
            System.out.println("Contact list is empty.");
            return;
        }
        if (head.name.equalsIgnoreCase(name)) {
            head = head.next;
            System.out.println("Contact deleted successfully!");
            return;
        }
        Contact prev = head;
        Contact curr = head.next;
        while (curr != null) {
            if (curr.name.equalsIgnoreCase(name)) {
                prev.next = curr.next;
                System.out.println("Contact deleted successfully!");
                return;
            }
            prev = curr;
            curr = curr.next;
        }
        System.out.println("Contact not found.");
    }

    public void emailSearch(String email) {
        Contact temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.email.equalsIgnoreCase(email)) {
                System.out.println("Name: " + temp.name);
                System.out.println("Phone: " + temp.phone);
                System.out.println("Email: " + temp.email);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("Contact list is empty.");
            return;
        }
        Contact temp = head;
        while (temp != null) {
            System.out.println("Name: " + temp.name);
            System.out.println("Phone: " + temp.phone);
            System.out.println("Email: " + temp.email);
            temp = temp.next;
        }
    }

    public void searchContact(String name) {
        Contact temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("Name: " + temp.name);
                System.out.println("Phone: " + temp.phone);
                System.out.println("Email: " + temp.email);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("Contact not found.");
        }
    }
}

package android.develop.a65apps.maxim.orlov.pojo;

import java.util.Objects;

public class Contact {

    private int id;
    private int contactImage;
    private String name;
    private String phone;
    private String phone2;
    private String email;
    private String email2;
    private String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return id == contact.id &&
                Objects.equals(contactImage, contact.contactImage) &&
                Objects.equals(name, contact.name) &&
                Objects.equals(phone, contact.phone) &&
                Objects.equals(phone2, contact.phone2) &&
                Objects.equals(email, contact.email) &&
                Objects.equals(email2, contact.email2) &&
                Objects.equals(description, contact.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, contactImage, name, phone, phone2, email, email2, description);
    }


    public Contact(int id, int contactImage, String name, String phone, String phone2, String email, String email2, String description) {
        this.id = id;
        this.contactImage = contactImage;
        this.name = name;
        this.phone = phone;
        this.phone2 = phone2;
        this.email = email;
        this.email2 = email2;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContactImage() {
        return contactImage;
    }

    public void setContactImage(int contactImage) {
        this.contactImage = contactImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

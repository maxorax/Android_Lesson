package android.develop.a65apps.maxim.orlov.pojo;

import java.util.Objects;

public class Contact {

    private final int id;
    private final int image;
    private final String name;
    private final String phone;
    private final String phone2;
    private final String email;
    private final String email2;
    private final String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return id == contact.id &&
                image == contact.image &&
                Objects.equals(name, contact.name) &&
                Objects.equals(phone, contact.phone) &&
                Objects.equals(phone2, contact.phone2) &&
                Objects.equals(email, contact.email) &&
                Objects.equals(email2, contact.email2) &&
                Objects.equals(description, contact.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, image, name, phone, phone2, email, email2, description);
    }

    public Contact(int id, int image, String name, String phone, String phone2, String email, String email2, String description) {
        this.id = id;
        this.image = image;
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

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getPhone2() {
        return phone2;
    }

    public String getEmail() {
        return email;
    }

    public String getEmail2() {
        return email2;
    }

    public String getDescription() {
        return description;
    }
}

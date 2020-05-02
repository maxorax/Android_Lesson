package android.develop.a65apps.maxim.orlov.pojo;

import java.util.Objects;

public class Contact {

    private final int ID;
    private final int IMAGE;
    private final String NAME;
    private final String PHONE;
    private final String PHONE2;
    private final String EMAIL;
    private final String EMAIL2;
    private final String DESCRIPTION;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return ID == contact.ID &&
                IMAGE == contact.IMAGE &&
                Objects.equals(NAME, contact.NAME) &&
                Objects.equals(PHONE, contact.PHONE) &&
                Objects.equals(PHONE2, contact.PHONE2) &&
                Objects.equals(EMAIL, contact.EMAIL) &&
                Objects.equals(EMAIL2, contact.EMAIL2) &&
                Objects.equals(DESCRIPTION, contact.DESCRIPTION);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, IMAGE, NAME, PHONE, PHONE2, EMAIL, EMAIL2, DESCRIPTION);
    }

    public int getID() {
        return ID;
    }

    public int getIMAGE() {
        return IMAGE;
    }

    public String getNAME() {
        return NAME;
    }

    public String getPHONE() {
        return PHONE;
    }

    public String getPHONE2() {
        return PHONE2;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public String getEMAIL2() {
        return EMAIL2;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public Contact(int ID, int IMAGE, String NAME, String PHONE, String PHONE2, String EMAIL, String EMAIL2, String DESCRIPTION) {
        this.ID = ID;
        this.IMAGE = IMAGE;
        this.NAME = NAME;
        this.PHONE = PHONE;
        this.PHONE2 = PHONE2;
        this.EMAIL = EMAIL;
        this.EMAIL2 = EMAIL2;
        this.DESCRIPTION = DESCRIPTION;
    }
}

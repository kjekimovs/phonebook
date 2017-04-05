package javaschool.app;

public class Note extends Record {
    private String note;

    public String getNote() {
        return note;
    }

    public void setText(String text) {
        this.note = text;
    }

    @Override
    public String toString() {
        return getId() + " " + getName() + " " + note;
    }
}

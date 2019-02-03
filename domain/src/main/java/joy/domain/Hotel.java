package joy.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.StringJoiner;

@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private boolean isOpen;
    private int classification;

    protected Hotel(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public int getClassification() {
        return classification;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Hotel.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("isOpen=" + isOpen)
                .add("classification=" + classification)
                .toString();
    }

    public Hotel(String name, boolean isOpen, int classification) {
        this.name = name;
        this.isOpen = isOpen;
        this.classification = classification;
    }
}

package hu.gde.runnersdemo;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
public class ShoeNameEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long shoeId;
    private String shoeName;

    @OneToMany(mappedBy = "shoeNameEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RunnerEntity> runners = new ArrayList<>();

    public ShoeNameEntity() {
    }

    public long getShoeId() {
        return shoeId;
    }

    public String getShoeName() { return shoeName; }

    public void setShoeId(long shoeId) {
        this.shoeId = shoeId;
    }

    public void setShoeName(String shoeName) {
        this.shoeName = shoeName;
    }

    public List<RunnerEntity> getRunners() {
        return runners;
    }
}

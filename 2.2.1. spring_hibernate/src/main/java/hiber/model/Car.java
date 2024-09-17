package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int series;
    private String model;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Car() {}

    public Car(int series, String model) {
        this.series = series;
        this.model = model;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public User getUser() {
        return user;
    }

    public User setUser(User user) {
        this.user = user;
        return user;
    }
}

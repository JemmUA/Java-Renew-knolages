package hilelll.hibernate.practicing.practice2.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "drivers", schema = "racing") // name = "racing.drivers" - works as well
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Embedded
    User user;

    public Driver(User user) {
        this.user = user;
    }

}


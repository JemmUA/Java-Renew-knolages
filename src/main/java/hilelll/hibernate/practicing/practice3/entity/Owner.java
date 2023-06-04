package hilelll.hibernate.practicing.practice3.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "owners", schema = "car_shop")
@ToString
@Getter
@Setter
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String surname;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(name = "car_id")
    private Integer carId;
    @Embedded
    private Info info;

}

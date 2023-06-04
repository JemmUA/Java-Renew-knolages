package hilelll.hibernate.relationships.model;

import hilelll.hibernate.relationships.model.enums.CarClassEnum;
import hilelll.hibernate.relationships.model.enums.ModelEnum;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "cars", schema = "portal")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@ToString
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    private ModelEnum model;
    @Enumerated(EnumType.STRING)
    private CarClassEnum carClass;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "driver_id")
    private Driver driver;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model=" + model +
                ", carClass=" + carClass +
//                ", driver=" + driver +
                '}';
    }
}

package hilelll.hibernate.practicing.practice3.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(schema = "car_shop", name = "car_infos")
@Getter
@Setter
public class CarInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String colour;
    private Info info;
}

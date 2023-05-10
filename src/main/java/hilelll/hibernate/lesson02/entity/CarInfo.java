package hilelll.hibernate.lesson02.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "car_infos", schema = "public")
@Getter
@Setter
public class CarInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private String colour;
    @Embedded
    private Info info;


}

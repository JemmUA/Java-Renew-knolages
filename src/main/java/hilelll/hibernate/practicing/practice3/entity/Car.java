package hilelll.hibernate.practicing.practice3.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "cars", schema = "car_shop")
@Getter
@Setter
@ToString
//@NamedNativeQuery(name = "getAll", query = "select * from car_shop.cars", resultClass = Car.class)
@NamedNativeQueries({
        @NamedNativeQuery(name = "getAll", query = "select * from car_shop.cars", resultClass = Car.class),
        @NamedNativeQuery(name = "getByModel", query = "select * from car_shop.cars where model = :model", resultClass = Car.class)
})
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String model;
    @Column(name = "vin_code")
    private String vinCode;
    private String type;
    @Column(name = "car_info_id")
    private Integer carInfoId;
}

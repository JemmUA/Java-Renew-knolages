package hibernate.lesson02.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="cars")
@Getter
@Setter
@ToString
@NamedNativeQueries({
        @NamedNativeQuery(name = "getAll", query = "select * from cars", resultClass = Car.class),
        @NamedNativeQuery(name = "deleteById", query = "delete from cars where id = :id", resultClass = Car.class),
        @NamedNativeQuery(name = "getByModel", query = "select * from cars where model= :model", resultClass = Car.class),
        @NamedNativeQuery(name = "getByType", query = "select * from cars where type= :type", resultClass = Car.class),
        @NamedNativeQuery(name = "getByVinCode", query = "select * from cars where vin_code = :vinCode", resultClass = Car.class)

})
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    private String model;
    @Column(name="vin_code")
    private String vinCode;
    private String type;
    @Column(name="car_info_id")
    private Integer carInfoId;


}

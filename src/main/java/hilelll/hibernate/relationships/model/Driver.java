package hilelll.hibernate.relationships.model;

import hilelll.hibernate.relationships.model.enums.LicenseEnum;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "drivers", schema = "portal")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    private LicenseEnum license;
    private String nick;

    @OneToOne(mappedBy = "driver")
    private User user;

    @OneToMany(mappedBy = "driver", fetch = FetchType.LAZY) // FetchType.EAGER
    private Set<Car> cars;

}

package hilelll.hibernate.relationships.model;

import hilelll.hibernate.relationships.model.enums.SexEnum;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users", schema = "portal")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String surname;
    private String password;
    private String email;
    private Integer age;
    @Enumerated(EnumType.STRING)
    private SexEnum sex;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "driver_id")
    private Driver driver;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role" ,schema = "portal",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private Set<Role> roles;
}

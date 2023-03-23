package hibernate.lesson03.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "roles")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//@ToString
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    @Enumerated(EnumType.STRING)
    private RolesEnum name;
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

}

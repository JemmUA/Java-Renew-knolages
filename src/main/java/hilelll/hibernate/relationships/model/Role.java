package hilelll.hibernate.relationships.model;

import hilelll.hibernate.relationships.model.enums.RoleEnum;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "roles", schema = "portal")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private RoleEnum role;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}

package hilelll.hibernate.relationship2.model;

import hilelll.hibernate.relationships.model.enums.RoleEnum;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;

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
    @Column(name = "role", unique = true)
    @Enumerated(EnumType.STRING)
    private RoleEnum role;

    @OneToOne(mappedBy = "role")
    private User user;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_id")
//    private User user;


//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "user_role" ,schema = "portal",
//            joinColumns = {@JoinColumn(name = "user_id")},
//            inverseJoinColumns = {@JoinColumn(name = "role_id")})
//    private HashSet<User> users;
}

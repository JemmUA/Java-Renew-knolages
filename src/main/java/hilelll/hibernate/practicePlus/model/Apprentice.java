package hilelll.hibernate.practicePlus.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "apprentice")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Apprentice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @ManyToMany
    @JoinTable(name = "sport_apprentice",
        joinColumns= {@JoinColumn(name = "apprentice_id")},
        inverseJoinColumns = {@JoinColumn(name = "sport_id")}
    )
    private Set<Sport> sports;
}

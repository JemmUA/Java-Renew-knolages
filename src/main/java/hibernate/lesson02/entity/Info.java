package hibernate.lesson02.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
@Getter
@Setter
public class Info {
    private String city;
    private String country;
    private LocalDateTime date;
    private String about;

}

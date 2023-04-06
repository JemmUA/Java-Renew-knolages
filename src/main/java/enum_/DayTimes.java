package enum_;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public enum DayTimes {
    MORNING_TIME("Ранок","Morning"),
    DAY_TIME("День","Afternoon"),
    EVENING_TIME("Вечір", "Evening"),
    NIGHT_TIME("Ніч", "Night");

    private String ukrainianTranslation;
    private String englishTranslation;

    DayTimes(String ukrainianTranslation, String englishTranslation) {
        this.ukrainianTranslation = ukrainianTranslation;
        this.englishTranslation = englishTranslation;
    }

    public String toSTring() {
        return "Зараз " + ukrainianTranslation.toLowerCase();
    }
}

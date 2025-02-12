package zoo.organizations;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import zoo.domains.Animal;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    @Autowired
    private VetClinic vetClinic;
}

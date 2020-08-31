package implementation.phrases;

import interfaces.CatchPhrase;
import org.springframework.stereotype.Service;

public class AllForTheKing implements CatchPhrase {
    public void sayPhrase() {
        System.out.println("All for the king!");
    }
}

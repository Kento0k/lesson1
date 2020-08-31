package implementation.phrases;

import interfaces.CatchPhrase;
import org.springframework.stereotype.Service;

public class IAmKnight implements CatchPhrase {
    public void sayPhrase(){
        System.out.println("I am knight!!!");
    }
}

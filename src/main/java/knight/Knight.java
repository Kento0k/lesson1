package knight;

import implementation.phrases.IAmKnight;
import interfaces.CatchPhrase;
import interfaces.Quest;
import org.springframework.beans.factory.annotation.Autowired;

public class Knight {

    @Autowired
    IAmKnight catchPhrase;

    private Quest quest;

    public Knight(){}

    public Knight(Quest quest){
        this.quest = quest;
    }

    public Quest getQuest() {
        return quest;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }


    public void embarkOnQuest(){
        System.out.println("I AM READY FOR QUEST");
    }

    public void sayPhrase(){
        catchPhrase.sayPhrase();
    }
}

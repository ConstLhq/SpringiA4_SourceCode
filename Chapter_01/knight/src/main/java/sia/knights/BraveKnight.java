package sia.knights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BraveKnight implements Knight {

  private Quest quest;
@Autowired
  public BraveKnight(Quest quest) {
    this.quest = quest;
  }

  public void embarkOnQuest() {
    quest.embark();
    test();
  }

  public void test(){
   System.out.println("test execution!");
  }

}

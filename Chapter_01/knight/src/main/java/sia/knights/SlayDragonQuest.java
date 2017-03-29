package sia.knights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.PrintStream;

@Component
public class SlayDragonQuest implements Quest {

  private PrintStream stream;
@Autowired
  public SlayDragonQuest(@Value("#{T(System).out}") PrintStream stream) {
    this.stream = stream;
  }

  public void embark() {
    stream.println("Embarking on quest to slay the dragon!");
  }

}

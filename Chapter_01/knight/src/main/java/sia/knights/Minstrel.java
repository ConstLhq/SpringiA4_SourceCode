package sia.knights;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.PrintStream;


@Aspect
@Component
public class Minstrel {
  private PrintStream stream;
//  @Pointcut("execution(* sia.knights.SlayDragonQuest.embark(..))")
  @Pointcut("execution(* sia.knights.Knight.embarkOnQuest(..))")
  public void perform(){}
  @Autowired
  public Minstrel(@Value("#{T(System).out}") PrintStream stream) {
    this.stream = stream;
  }
  @Before("perform()")
  public void singBeforeQuest() {
    stream.println("Fa la la, the knight is so brave!");
  }
  @After("perform()")
  public void singAfterQuest() {
    stream.println("Tee hee hee, the brave knight " +
    		"did embark on a quest!");
  }

  @Around("perform()")
  public void watchKnight(ProceedingJoinPoint pj) throws  Throwable{
    stream.println("around advice before!");
    pj.proceed();
    stream.println("around advice after!");
  }

}

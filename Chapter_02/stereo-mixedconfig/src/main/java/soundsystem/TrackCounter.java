package soundsystem;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhq-mint on 17-3-29.
 */
@Component
@Aspect
public class TrackCounter {

    private Map<String,Integer> counter  = new HashMap<>();
    @Pointcut("execution(* soundsystem.Di.playTrack(String)) && args(t)")
    public void trackPlayed(String t){}

    @Pointcut("execution(* soundsystem.BlankDisc.play())")
    public void played(){}

    @AfterReturning("played()")
    public void printInfo(){
        System.out.println(counter);
    }

    @Before("trackPlayed(t)")
    public  void countTrack(String t){
        int cur= getCurentNumber(t);
        counter.put(t,cur+1);
    }

    public int getCurentNumber(String track){
         return counter.containsKey(track)? counter.get(track):0;

    }



}

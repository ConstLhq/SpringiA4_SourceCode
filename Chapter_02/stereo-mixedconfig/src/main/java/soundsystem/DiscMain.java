package soundsystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Created by lhq-mint on 17-3-29.
 */
public class DiscMain {

    public static void main(String args[]){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SoundSystemConfig.class);
        CompactDisc cd = context.getBean(CompactDisc.class);
        cd.play();
    }


}

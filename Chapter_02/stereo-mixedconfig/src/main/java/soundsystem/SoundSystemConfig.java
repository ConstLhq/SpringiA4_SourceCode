package soundsystem;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
@ImportResource("classpath:cd-config.xml")
@EnableAspectJAutoProxy
public class SoundSystemConfig {

}

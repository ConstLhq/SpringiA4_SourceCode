package sia.knights.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import sia.knights.BraveKnight;
import sia.knights.Knight;
import sia.knights.Quest;
import sia.knights.SlayDragonQuest;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackageClasses = {sia.knights.BraveKnight.class})

public class KnightConfig {

//  @Bean
//  public Knight knight() {
//    return new BraveKnight(quest());
//  }
//
//  @Bean
//  public Quest quest() {
//    return new SlayDragonQuest(System.out);
//  }

}

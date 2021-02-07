package pl.mateuszwojcik.atm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.mateuszwojcik.atm.database.DataBase;

@Configuration
public class Config {
    @Bean
    public DataBase openConnection() {
        return new DataBase();
    }
}

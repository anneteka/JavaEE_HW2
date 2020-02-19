package main.field;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigField {
    @Bean
    public ItemField itemField() {
        return new BreadField();
    }
}
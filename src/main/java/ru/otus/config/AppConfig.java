package ru.otus.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.util.Locale;

@Configuration
public class AppConfig {

    @Bean
    public MessageSource messageSource(ApplicationSettings settings) {
        ReloadableResourceBundleMessageSource ms = new ReloadableResourceBundleMessageSource();
        ms.setBasename(settings.getBundleBasename());
        ms.setDefaultEncoding(settings.getDefEncoding());
        return ms;
    }

    @Bean
    public Locale locale(ApplicationSettings settings) {
        return new Locale(settings.getLocaleProp());
    }
}

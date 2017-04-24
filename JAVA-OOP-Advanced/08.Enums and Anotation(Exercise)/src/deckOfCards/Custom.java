package deckOfCards;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Custom {
    String type();
    String categories();
    String description();

}

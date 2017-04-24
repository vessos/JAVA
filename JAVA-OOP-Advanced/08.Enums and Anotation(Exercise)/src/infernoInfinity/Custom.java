package infernoInfinity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Custom {
    String author() default "";
    int revision() default 0;
    String description() default "";
    String[] reviewers() default "";
}

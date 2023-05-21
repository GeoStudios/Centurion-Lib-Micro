package main.org.geostudios.lang.annotations;

import main.org.centurion.annotations.NonNls;

import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Specifies that an element of the program represents a string that is a regular expression text supported
 * by {@link java.util.regex.Pattern}.
 * Code editors may use this annotation to enable syntax highlighting, code completion and other features
 * inside the literals that assigned to the annotated variables, passed as arguments to the annotated parameters,
 * or returned from the annotated methods.
 *
 * @see Language
 *
 * @author Logan Abernathy
 * @since CDK-Lib 1.0.0
 */
@Retention(RetentionPolicy.CLASS)
@Target({METHOD, FIELD, PARAMETER, LOCAL_VARIABLE, ANNOTATION_TYPE})
@Language("RegExp")
public @interface RegExp {
    /**
     * A constant prefix that is assumed to be implicitly added before the regular expression.
     */
    @NonNls String prefix() default "";
    /**
     * A constant suffix that is assumed to be implicitly added after the regular expression.
     */
    @NonNls String suffix() default "";
}

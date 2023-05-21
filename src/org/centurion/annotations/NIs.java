package main.org.centurion.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Specifies that an element of the program is an user-visible string which needs to be localized.
 * This annotation is intended to be used by localization tools for
 * detecting strings which should be reported as requiring localization.
 *
 * <p>
 * This annotation also could be used as a meta-annotation, to define derived annotations for convenience.
 * E.g. the following annotation could be defined to annotate the strings that represent dialog titles:
 *
 * <pre>
 * &#64;Nls(capitalization = Capitalization.Title)
 * &#64;interface DialogTitle {}
 * </pre>
 * <p>
 * Note that using the derived annotation as meta-annotation is not supported.
 * Meta-annotation works only one level deep.
 *
 * @see NonNls
 *
 * @author Logan Abernathy
 * @since CDK-Lib 1.0.0
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE, ElementType.TYPE, ElementType.PACKAGE})
public @interface Nls {

    enum Capitalization {

        NotSpecified,
        /**
         * e.g. This Is a Title
         */
        Title,
        /**
         * e.g. This is a sentence
         */
        Sentence
    }

    Capitalization capitalization() default Capitalization.NotSpecified;
}

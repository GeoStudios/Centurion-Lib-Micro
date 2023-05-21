package org.geostudios.lang.annotations;

import java.lang.annotation.*;

/**
 * Specifies the replacement value for non-constant variables and method return values.
 * This may help static analyzers to properly parse the concatenation of several values
 * which is used in @{@link Language} or {@link Pattern} context.
 * <p>
 * Example:
 * <pre>
 * &#64;Subst("Tahoma")
 * final String font = new JLabel().getFont().getName();
 *
 * &#64;Language("HTML")
 * String message = "&lt;html&gt;&lt;span style='font: " + font + "; font-size:smaller'&gt;"
 *   + ... + "&lt;/span&gt;&lt;/html&gt;";
 * </pre>
 * <p>
 * Here the parser assumes that when {@code font} appears in the concatenation it's value is {@code "Tahoma"},
 * so it can continue parsing the concatenation.
 * </p>
 *
 * @see Language
 * @see Pattern
 *
 * @author Logan Abernathy
 * @since CDK-Lib 1.0.0
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER})
public @interface Subst {
    String value();
}

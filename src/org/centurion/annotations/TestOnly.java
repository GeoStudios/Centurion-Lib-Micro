package org.centurion.annotations;

import java.lang.annotation.*;

/**
 * A member or type annotated with TestOnly claims that it should be used from testing code only.
 * <p>
 * Apart from documentation purposes this annotation is intended to be used by static analysis tools
 * to validate against element contract violations.
 * <p>
 * This annotation means that the annotated element exposes internal data and breaks encapsulation
 * of the containing class; the annotation won't prevent its use from production code, developers
 * even won't see warnings if their IDE doesn't support the annotation. It's better to provide
 * proper API which can be used in production as well as in tests.
 *
 * @author Logan Abernathy
 * @since CDK-Lib 1.0.0
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.TYPE})
public @interface TestOnly { }
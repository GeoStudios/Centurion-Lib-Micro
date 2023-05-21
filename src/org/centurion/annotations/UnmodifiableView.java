package org.centurion.annotations;

import java.lang.annotation.*;

/**
 * An annotation which marks a {@link java.util.Collection} or {@link java.util.Map} type
 * as unmodifiable view. A collection or a map is unmodifiable view if any mutator methods
 * (e.g. {@link java.util.Collection#add(Object)}) throw exception or have no effect.
 * However, the content of the collection or the map may still be updated by other code.
 *
 * @see Unmodifiable
 * @author Logan Abernathy
 * @since CDK-Lib 1.0.0
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE_USE})
public @interface UnmodifiableView {
}
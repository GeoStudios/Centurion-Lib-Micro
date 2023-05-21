package org.centurion.annotations;

import java.lang.annotation.*;

/**
 * An annotation which marks a {@link java.util.Collection} or {@link java.util.Map} type
 * as unmodifiable. A collection or a map is unmodifiable if any mutator methods
 * (e.g. {@link java.util.Collection#add(Object)}) throw exception or have no effect,
 * and the object references stored as collection elements, map keys, and map values
 * are never changed. The referenced objects themselves still could be changed if they
 * are mutable.
 *
 * @see UnmodifiableView
 * @author Logan Abernathy
 * @since CDK-Lib 1.0.0
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE_USE})
public @interface Unmodifiable {
}
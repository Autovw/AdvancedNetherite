package com.autovw.advancednetherite.api.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Author: Autovw
 * <br/>
 * Annotation for marking classes, methods, fields etc. as <b>internal</b>.
 * This annotation does <b>not</b> exist at runtime, and is purely used for marking code internal.
 * Code marked with this annotation is not recommended using or to {@link Override} and is subject to change between releases.
 * Alternatives to the "internal" marked code can be referenced using a javadoc.
 * @since 1.11.0
 */
@Retention(RetentionPolicy.CLASS)
public @interface Internal {
}

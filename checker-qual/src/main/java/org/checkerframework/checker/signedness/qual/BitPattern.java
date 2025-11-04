package org.checkerframework.checker.signedness.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;

/**
 * The value represents a bit pattern, not an arithmetic quantity. Examples include the return value
 * of {@link Double#doubleToLongBits(double)} and values used as bitsets.
 *
 * <p>Bitwise operators ({@code &}, {@code |}, {@code ^}, {@code ~}) and shifts ({@code <<}, {@code
 * >>}, {@code >>>}) are permitted on {@code @BitPattern} values. Arithmetic operators ({@code +},
 * {@code -}, {@code *}, {@code /}, {@code %}) and non-equality comparisons ({@code <}, {@code <=},
 * {@code >}, {@code >=}) are forbidden.
 *
 * <p>This type qualifier is a subtype of {@link UnknownSignedness} and a supertype of {@link
 * SignednessBottom}, but is unrelated to {@link Signed}, {@link Unsigned}, {@link SignednessGlb},
 * and {@link SignedPositive}.
 *
 * @checker_framework.manual #signedness-checker Signedness Checker
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@SubtypeOf({UnknownSignedness.class})
public @interface BitPattern {}

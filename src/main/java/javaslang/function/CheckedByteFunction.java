/**    / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javaslang.function;

import java.io.Serializable;

/**
 * Checked version of java.util.function.ByteFunction.
 * Essentially the same as {@code CheckedFunction1<Byte, R>}, or short {@code X1<Byte, R>}.
 *
 * @param <R> Return value type
 */
@FunctionalInterface
public interface CheckedByteFunction<R> extends Serializable {

    R apply(boolean b) throws Throwable;
}
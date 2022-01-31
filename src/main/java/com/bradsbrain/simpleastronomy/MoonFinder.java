/*
 *  Copyright 2011 Brad Parks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bradsbrain.simpleastronomy;

/**
 * An interface for searching for a moon phase for use in a binary search.
 */
public interface MoonFinder {

    /**
     * Determines if the desired moon type is earlier or later than the given information.
     * 
     * @param angle a moon angle
     * @param percent a moon visible percentage
     * @return true if the moon is earlier in time than the supplied information
     */
    boolean isMoonBefore(double angle, double percent);

}

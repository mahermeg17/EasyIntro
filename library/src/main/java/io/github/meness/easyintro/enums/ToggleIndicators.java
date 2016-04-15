/*
 * Copyright 2016 Alireza Eskandarpour Shoferi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.meness.easyintro.enums;

/**
 * @see ToggleIndicators#DEFAULT - All indicators will be displayed
 * @see ToggleIndicators#WITHOUT_SKIP - All indicators but skip one will be displayed
 * @see ToggleIndicators#NO_LEFT_INDICATOR - Only right (next and done indicators) will be displayed
 * @see ToggleIndicators#NONE - No left and right indicators will be displayed
 * <p>
 * Note: Swipe direction will be adjusted by which type of above types is choosed.
 */
public enum ToggleIndicators {
    DEFAULT(SwipeDirection.ALL), WITHOUT_SKIP(SwipeDirection.ALL), NO_LEFT_INDICATOR(SwipeDirection.LEFT), NONE(SwipeDirection.NONE);

    private final SwipeDirection mSwipeDirection;

    ToggleIndicators(SwipeDirection mSwipeDirection) {
        this.mSwipeDirection = mSwipeDirection;
    }

    public SwipeDirection getSwipeDirection() {
        return mSwipeDirection;
    }
}

/*
 * Copyright 2006-2012 Amazon Technologies, Inc. or its affiliates.
 * Amazon, Amazon.com and Carbonado are trademarks or registered trademarks
 * of Amazon Technologies, Inc. or its affiliates.  All rights reserved.
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

package com.amazon.carbonado;

/**
 * Thrown if a fetch operation fails because lock acquisition timed out.
 *
 * @author Brian S O'Neill
 */
public class FetchTimeoutException extends FetchException {
    private static final long serialVersionUID = 1L;

    public FetchTimeoutException() {
        super();
    }

    public FetchTimeoutException(String message) {
        super(message);
    }

    public FetchTimeoutException(String message, Throwable cause) {
        super(message, cause);
    }

    public FetchTimeoutException(Throwable cause) {
        super(cause);
    }

    @Override
    protected PersistException makePersistException(String message, Throwable cause) {
        return new PersistTimeoutException(message, cause);
    }
}

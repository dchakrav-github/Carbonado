/*
 * Copyright 2008 Amazon Technologies, Inc. or its affiliates.
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

package com.amazon.carbonado.gen;

import com.amazon.carbonado.FetchException;
import com.amazon.carbonado.PersistException;
import com.amazon.carbonado.Storable;

/**
 * Provides runtime support for Storable classes generated by {@link DelegateStorableGenerator}.
 *
 * @author Brian S O'Neill
 * @since 1.2
 */
public interface DelegateSupport<S extends Storable> extends MasterSupport<S> {
    boolean doTryLoad(S storable) throws FetchException;

    boolean doTryInsert(S storable) throws PersistException;

    boolean doTryUpdate(S storable) throws PersistException;

    boolean doTryDelete(S storable) throws PersistException;
}

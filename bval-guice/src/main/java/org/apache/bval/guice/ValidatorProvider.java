/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.bval.guice;

import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;

/**
 * Validator guice provider implementation.
 *
 * @version $Id$
 */
@Singleton
public final class ValidatorProvider implements Provider<Validator> {

    /**
     * The validator reference.
     */
    private final Validator validator;

    /**
     * Build a new ValidatorProvider by ValidatorFactory.
     *
     * @param validatorFactory the ValidatorFactory reference.
     */
    @Inject
    public ValidatorProvider(ValidatorFactory validatorFactory) {
        this.validator = validatorFactory.getValidator();
    }

    /**
     * {@inheritDoc}
     */
    public Validator get() {
        return this.validator;
    }

}

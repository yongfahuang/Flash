/*
 * Copyright 2017-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.flash.cn.util;

import org.junit.Test;

import java.io.IOException;

/**
 * {@link LoadProperties} Test.
 *
 * @author kay
 * @version v1.0
 */
public class PropertiesUtilsTest {

    @Test
    public void test() throws IOException {
        String packageName = LoadProperties.INSTANCE.load("packageName");
        System.out.println(packageName);
    }

    @Test
    public void test1() throws IOException {
        String containerModes = LoadProperties.INSTANCE.load("containerModes");
        System.out.println(containerModes);
    }
}

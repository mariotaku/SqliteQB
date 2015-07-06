/*
 * Copyright (c) 2015 mariotaku
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

package org.mariotaku.sqliteqb.library.query;

import org.mariotaku.sqliteqb.library.SQLQuery;

public class SQLDropQuery implements SQLQuery {

    private final boolean dropIfExists;
    private final String type;
    private final String target;

    public SQLDropQuery(final boolean dropIfExists, final String type, final String target) {
        if (target == null) throw new NullPointerException();
        this.dropIfExists = dropIfExists;
        this.type = type;
        this.target = target;
    }

    @Override
    public final String getSQL() {
        if (dropIfExists) return String.format("DROP %s IF EXISTS %s", type, target);
        return String.format("DROP %s %s", type, target);
    }

}
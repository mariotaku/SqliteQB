package org.mariotaku.sqliteqb.library.query;

public class SQLDropViewQuery extends SQLDropQuery {

    public SQLDropViewQuery(final boolean dropIfExists, final String table) {
        super(dropIfExists, "VIEW", table);
    }

}

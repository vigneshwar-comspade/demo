/*
 * This file is generated by jOOQ.
*/
package com.jooq.db;


import com.jooq.db.tables.Employe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Comm extends SchemaImpl {

    private static final long serialVersionUID = -285412453;

    /**
     * The reference instance of <code>comm</code>
     */
    public static final Comm COMM = new Comm();

    /**
     * The table <code>comm.employe</code>.
     */
    public final Employe EMPLOYE = com.jooq.db.tables.Employe.EMPLOYE;

    /**
     * No further instances allowed
     */
    private Comm() {
        super("comm", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Employe.EMPLOYE);
    }
}

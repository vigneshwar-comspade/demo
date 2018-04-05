/*
 * This file is generated by jOOQ.
*/
package com.jooq.db.tables.records;


import com.jooq.db.tables.Employe;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


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
public class EmployeRecord extends TableRecordImpl<EmployeRecord> implements Record3<Integer, String, Integer> {

    private static final long serialVersionUID = 1809314669;

    /**
     * Setter for <code>comm.employe.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>comm.employe.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>comm.employe.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>comm.employe.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>comm.employe.age</code>.
     */
    public void setAge(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>comm.employe.age</code>.
     */
    public Integer getAge() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Employe.EMPLOYE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Employe.EMPLOYE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Employe.EMPLOYE.AGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getAge();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getAge();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeRecord value3(Integer value) {
        setAge(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeRecord values(Integer value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmployeRecord
     */
    public EmployeRecord() {
        super(Employe.EMPLOYE);
    }

    /**
     * Create a detached, initialised EmployeRecord
     */
    public EmployeRecord(Integer id, String name, Integer age) {
        super(Employe.EMPLOYE);

        set(0, id);
        set(1, name);
        set(2, age);
    }
}
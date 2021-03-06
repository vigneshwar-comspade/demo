/*
 * This file is generated by jOOQ.
*/
package com.jooq.db.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class Employe implements Serializable {

    private static final long serialVersionUID = 1069637303;

    private Integer id;
    private String  name;
    private Integer age;

    public Employe() {}

    public Employe(Employe value) {
        this.id = value.id;
        this.name = value.name;
        this.age = value.age;
    }

    public Employe(
        Integer id,
        String  name,
        Integer age
    ) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Employe other = (Employe) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (age == null) {
            if (other.age != null)
                return false;
        }
        else if (!age.equals(other.age))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.age == null) ? 0 : this.age.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Employe (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(age);

        sb.append(")");
        return sb.toString();
    }
}

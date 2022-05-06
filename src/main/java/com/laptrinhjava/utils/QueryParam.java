package com.laptrinhjava.utils;

import java.util.Objects;

public class QueryParam {
    protected String attribute;
    protected String compare;
    protected Object value;

    public QueryParam() {
    }

    public QueryParam(String attribute, String compare, Object value) {
        this.attribute = attribute;
        this.compare = compare;
        this.value = value;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getCompare() {
        return compare;
    }

    public void setCompare(String compare) {
        this.compare = compare;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QueryParam that = (QueryParam) o;
        return Objects.equals(attribute, that.attribute) && Objects.equals(compare, that.compare) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attribute, compare, value);
    }

    @Override
    public String toString() {
        return "QueryParam{" +
                "attribute='" + attribute + '\'' +
                ", compare='" + compare + '\'' +
                ", value=" + value +
                '}';
    }

}

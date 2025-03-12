package org.tuc;

public class ElementImpl implements Element {
    private final int key;
    private final String data;

    // Constructor
    public ElementImpl(int key, String data) {
        this.key = key;
        this.data = data;
    }

    @Override
    public int getKey() {
        return key;
    }

    @Override
    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Element{key=" + key + ", data='" + data + "'}";
    }
}


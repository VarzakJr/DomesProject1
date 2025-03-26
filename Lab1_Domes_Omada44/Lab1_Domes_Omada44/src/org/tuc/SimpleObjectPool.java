package org.tuc;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleObjectPool implements ObjectPool {
    private Queue<Object> pool = new LinkedList<>();

    @Override
    public boolean hasFreeObject() {
        return !pool.isEmpty();
    }

    @Override
    public void addObject(Object obj) {
        if (obj != null) {
            pool.offer(obj);
        }
    }

    @Override
    public Object getObject() {
        return pool.poll();
    }

    @Override
    public int length() {
        return pool.size();
    }
}





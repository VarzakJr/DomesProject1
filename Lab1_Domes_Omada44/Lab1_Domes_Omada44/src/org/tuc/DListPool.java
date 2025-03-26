package org.tuc;

public class DListPool extends DList {
    private final ObjectPool elementPool;

    public DListPool() {
        this(new SimpleObjectPool());  // Default pool
    }

    public DListPool(ObjectPool pool) {
        this.elementPool = pool;
    }

    @Override
    public boolean insert(int key, String data) {
        Element element = elementPool.hasFreeObject()
                ? (Element) elementPool.getObject()
                : new DListElement(key, data);

        // Reinitialize the element
        ((DListElement) element).setKey(key);
        ((DListElement) element).setData(data);

        return super.insert(element);  // Assume DList has this helper
    }

    @Override
    public boolean delete(int key) {
        Node node = findNode(key);  // Helper method
        if (node != null) {
            elementPool.addObject(node.getElement());
            return super.delete(key);
        }
        return false;
    }
}
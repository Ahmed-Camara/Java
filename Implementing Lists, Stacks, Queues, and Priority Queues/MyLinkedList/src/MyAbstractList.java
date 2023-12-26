import java.util.Iterator;
public abstract class MyAbstractList<E> implements MyList<E> {

    protected int size = 0;

    protected MyAbstractList() {}

    protected MyAbstractList(E[] objects) {

        for(int i = 0; i < objects.length; i++) {
            add(objects[i]);
        }
    }
    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void add(E e) {
        // TODO Auto-generated method stub
        add(size, e);
    }

    @Override
    public void add(int index, E e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean contains(E e) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public E get(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int indexOf(E e) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return size == 0;
    }

    @Override
    public int lastIndexOf(E e) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean remove(E e) {
        // TODO Auto-generated method stub
        if(indexOf(e) >= 0) {
            remove(indexOf(e));
            return true;
        }

        return false;
    }

    @Override
    public E remove(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object set(int index, E e) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return size;
    }

}

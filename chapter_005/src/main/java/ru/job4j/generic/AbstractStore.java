package ru.job4j.generic;

@SuppressWarnings("unchecked")
public class AbstractStore<T extends Base> implements Store<T> {
    private SimpleArray<T> data;

    public AbstractStore(int n) {
        data = new SimpleArray(n);
    }

    @Override
    public void add(T model) {
        data.add(model);
    }

    @Override
    public boolean replace(String id, T model) {
        boolean result = false;
        int index = findIndexById(id);
        if (index != -1) {
            data.set(index, model);
            result = true;
        }
        return result;
    }

    @Override
    public boolean delete(String id) {
        boolean result = false;
        int index = findIndexById(id);
        if (index != -1) {
            data.remove(index);
            result = true;
        }
        return result;
    }

    @Override
    public T findById(String id) {
        T result = null;
        int index = findIndexById(id);
        if (index != -1) {
            result = data.get(index);
        }
        return result;
    }

    private int findIndexById(String id) {
        int result = -1;
        for (int i = 0; i != data.getSize(); i++) {
            if (data.get(i).getId().equals(id)) {
                result = i;
                break;
            }
        }
        return result;
    }
}

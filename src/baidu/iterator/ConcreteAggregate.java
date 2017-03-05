package baidu.iterator;

import java.util.List;

import javax.management.AttributeList;

/**
 * Created by langshiquan on 17/3/5.
 */
public class ConcreteAggregate {
    private List<Object> list = new AttributeList();

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public ConcreteIterator getIterator() {
        return new ConcreteIterator();
    }

    public void addObject(Object object) {
        this.list.add(object);
    }

    public void removeObject(Object object) {
        this.list.remove(object);
    }

    // 使用内部类定义迭代器
    private class ConcreteIterator implements MIterator {

        private int cursor = 0;// 游标，用于记录遍历的位置

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
            if (cursor <= list.size() - 1) {
                cursor++;
            }

        }

        @Override
        public boolean hasNext() {
            if (cursor < list.size()) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public boolean isFirst() {
            return cursor == 0;
        }

        @Override
        public boolean isLast() {
            return cursor == list.size() - 1;
        }

        @Override
        public Object getCurrentObj() {
            return list.get(cursor);
        }
    }
}

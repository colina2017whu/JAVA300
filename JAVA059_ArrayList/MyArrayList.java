package JAVA300.JAVA059_ArrayList;

/**
 * 模拟JDK中提供的ArrayList类的实现
 */

public class MyArrayList {
    /**
     * The value is used for object storage
     */
    Object value[];

    /**
     * The size is the number of object used
     */
    private int size;

    public MyArrayList() {
        //value = new Object[16];
        this(16);//一个构造器调用另一个构造器
    }

    public MyArrayList(int size) {
        value = new Object[size];
    }

    public void add(Object obj) { //给容器加东西
        value[size] = obj;
        size++;
        if(size>=value.length) {
            //装不下了，要扩容
            int newCapacity = value.length*2;
            Object[] newList = new Object[newCapacity];
            //System.arraycopy();
            for(int i = 0; i < value.length; i++) { //把老数组中的东西考到新数组中
                newList[i] = value[i];
            }
            value = newList;
        }
    }

    public Object get(int index) {
        if(index<0||index>size-1) { //超出0-[size-1] 手动抛出异常
           try {
               throw new Exception();
           }catch (Exception e) {
               e.printStackTrace();
           }
        }
        return value[index];
    }

    public int indexOf(Object obj) {
        if(obj == null) {
            return -1;
        }else {
            for(int i = 0; i < value.length; i++) {
                if(obj == value[i]) {
                    return i;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(1); //不够可扩容
        list.add("aaa");
        list.add(new Human("WHU"));
        list.add("bbb");

        Human h = (Human) list.get(1);
        System.out.println(h.getName());

        System.out.println(list.get(2));
    }
}

class Human {
    String name;
    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

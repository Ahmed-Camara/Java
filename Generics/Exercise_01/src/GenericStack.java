public class GenericStack <E>{

    private E[] list;
    private int size;

    public GenericStack(){
        list  =(E[]) new Object[16];
        size = 0;
    }
    public void push(E o){

        if(size >= list.length){
            E[] newList = (E[]) new Object[list.length * 2];
            System.arraycopy(list,0,newList,0,list.length);
            list = newList;
        }

        list[size] = o;
        size++;
    }
    public E peek(){
        E o = list[size-1];
        return o;
    }

    public E pop(){
        E o = peek();
        size = size - 1;
        return o;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }
    @Override
    public String toString(){
        String as = "";

        for(int i = size-1; i >= 0; i--){
            as = as + list[i]+" ";
        }

        return as;
    }
}

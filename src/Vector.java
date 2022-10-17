public class Vector {
    int capacity;
    int size;
    int[] data;

    public Vector(){}

    public Vector(int capacity){
        this.capacity = capacity;
        this.data = new int[capacity];
    }

    public void push_back(int data) {
        if (size >= capacity) {
            resize(capacity * 2);
        } else {
            if(size==0){
                this.data[size] = data;
                size++;
                return;
            }
            this.data[size] = data;
            size++;
        }
    }

    public void pop_back(){
        this.data[size]=0;
    }
    public void resize(int newCapacity) {
        int[] tmp=this.data;
        this.data = new int[newCapacity];
        data=tmp;
    }

    public void push(int data, int index) {

        int [] tmp=new int[size];
        for (int i = index; i < size; i++) {
            tmp[i]=this.data[i];
            this.data[i]=0;
        }
        this.data[index]=data;
        for(int i=index++; i<size; i++){
            this.data[i]=tmp[i];
        }
    }

    public void pushFront(int data) {

        int [] tmp=new int[size];
        for (int i = 0; i < size; i++) {
            tmp[i]=this.data[i];
            this.data[i]=0;
        }
        this.data[0]=data;
        for(int i=1; i<size; i++){
            this.data[i]=tmp[i];
        }
    }

    public void popFront(){
        int [] tmp=new int[size];
        for (int i = 1; i < size; i++) {
            tmp[i]=this.data[i];
            this.data[i]=0;
        }
        for(int i=0; i<size; i++){
            this.data[i]=tmp[i];
        }

    }

    public int getAt(int index){
        return this.data[index];
    }
    public void setAt(int index, int data){
        this.data[index]=data;
    }
}


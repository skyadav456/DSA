package heap;

public class DynamicHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public DynamicHeap(int capacity){
        this.capacity=capacity;
        this.heap= new int[capacity];
        this.size=0;
    }

    // insert method
    public void insert(int value){
        if(size==capacity){
            resize();
        }
        heap[size]= value;
        size++;
        heapify(size-1);
    }

    private void heapify(int index) {
        while(index>0){
            int parentIndex= (index-1)/2;

            if(heap[index]>heap[parentIndex]){
                swap(index,parentIndex);
                index= parentIndex;
            } else {
                break;
            }
        }
    }

    // delete method
    public  int deleteRoot(){
        if(size==0){
            return Integer.MAX_VALUE;
        }
        int root= heap[0];
        heap[0]= heap[size-1];
        size--;
        if(size>0){
            heapifyDown(0);
        }
        return root;
    }

    private void heapifyDown(int index) {
        while(true){
            int leftChildIndex= 2*index+1;
            int rightChildIndex= 2*index+2;
            int largest= index;

            if(leftChildIndex<size && heap[leftChildIndex]>heap[largest]){
                largest= leftChildIndex;
            }
            if(rightChildIndex<size && heap[rightChildIndex]>heap[largest]){
                largest= rightChildIndex;
            }
            if(largest==index){
                break;
            }
            swap(index,largest);
            index= largest;
        }
    }

    private void swap(int index1, int index2) {
        int temp= heap[index1];
        heap[index1]= heap[index2];
        heap[index2]= temp;
    }

    // resize method
    public void resize(){
        capacity= capacity*2;
        int[] newHeap= new int[capacity];
        for(int i=0;i<size;i++){
            newHeap[i]= heap[i];
        }
        heap= newHeap;
    }
    public int size(){
        return size;
    }
    public int capacity(){
        return capacity;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void print(){
        for(int i=0;i<size;i++){
            System.out.print(heap[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DynamicHeap heap= new DynamicHeap(5);
        heap.insert(50);
        heap.insert(30);
        heap.insert(35);
        heap.insert(10);
        heap.insert(20);
        System.out.println("heap");
        heap.print();
        System.out.println("capacity : "+heap.capacity());
        heap.insert(60);  // add size dynamically
        heap.print();
        heap.deleteRoot();
        heap.print();
    }
}

package heap;

import java.util.ArrayList;

public class MaxHeap {

    private ArrayList<Integer> heap;
    public MaxHeap(){
        heap= new ArrayList<>();
    }
    // utility method
    public int size(){
        return heap.size();
    }
    public boolean isEmpty(){
        return heap.isEmpty();
    }

    public void print(){
        System.out.println(heap);
    }

    // insert method
    public void insert(int value){
        heap.add(value);
        heapifyUp(heap.size()-1);
    }

    private void heapifyUp(int index) {
        while(index>0){
            int parentIndex= (index-1)/2;
            if(heap.get(index)>heap.get(parentIndex)){
                swap(index,parentIndex);
                index= parentIndex;  // to check the parent
            }else {
                break;
            }
        }
    }
    // swap method
    private void swap(int index1, int index2){
        int temp= heap.get(index1);
        heap.set(index1,heap.get(index2));
        heap.set(index2,temp);
    }

    // delete root method

    public int deleteRoot(){
        int size= heap.size();
        if(size==0){
            return Integer.MAX_VALUE;
        }
        // get the root value
        int root= heap.get(0);
        // move last element to root
        heap.set(0, heap.get(size-1));
        // remove the last element
        heap.remove(size-1);
        // apply heapify down to restore heap
        if(size>1){
            heapifyDown(0);
        }
        return root;
    }

    public void heapifyDown(int index){
        int size= heap.size();
        while(true){
            int leftChildIndex= 2*index+1;
            int rightChildIndex= 2*index+2;
            int largest= index;
            if(leftChildIndex<size && heap.get(leftChildIndex)>heap.get(largest)){
                largest= leftChildIndex;
            }
            if(rightChildIndex<size && heap.get(rightChildIndex)>heap.get(largest)){
                largest= rightChildIndex;
            }
            if(largest==index){
                break;
            }
            swap(index,largest);
            index= largest;
        }
    }

    // peek value method
    public int peek(){
        if(heap.isEmpty()){
            return Integer.MAX_VALUE;
        }
        return heap.get(0);
    }



    public static void main(String[] args) {
        MaxHeap heap= new MaxHeap();
        heap.insert(50);
        heap.insert(30);
        heap.insert(35);
        heap.insert(10);
        heap.insert(20);
        heap.insert(60);
        heap.print();

        heap.deleteRoot();
        heap.print();

    }
}

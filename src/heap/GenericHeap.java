package heap;

import java.util.ArrayList;
import java.util.Comparator;

import static java.util.Collections.swap;

public class GenericHeap<T> {
    private ArrayList<T> heap= new ArrayList<>();
    private Comparator<T> comparator;

    public GenericHeap(Comparator<T> comparator){
        this.comparator=comparator;
    }

    // insert method
    public void insert(T value){
        heap.add(value);
        heapifyUp(heap.size()-1);
    }

    public T deleteRoot(){
        if(heap.isEmpty()){
            return null;
        }
        T root= heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        heapifyDown(0);
        return root;
    }
    private void heapifyUp(int index){
        while(index>0){
            int parentIndex= (index-1)/2;
            if (comparator.compare(heap.get(parentIndex), heap.get(index)) >= 0) break;
            swap( parentIndex,index);
            index= parentIndex;
        }
    }

    private void swap(int parentIndex, int index) {
        T temp= heap.get(parentIndex);
        heap.set(parentIndex,heap.get(index));
        heap.set(index,temp);
    }

    private void heapifyDown(int index) {
        while(true){
            int leftChildIndex= 2*index+1;
            int rightChildIndex= 2*index+2;
            int largest= index;

            if(leftChildIndex< heap.size() &&
                    comparator.compare(heap.get(leftChildIndex), heap.get(largest)) > 0){
                largest= leftChildIndex;
            }
            if(rightChildIndex< heap.size() &&
                    comparator.compare(heap.get(rightChildIndex), heap.get(largest)) > 0){
                largest= rightChildIndex;
            }
            if(largest==index){
                break;
            }else{
                swap(index,largest);
            }
        }

    }

    public void print(){
        System.out.println(heap);
    }

    public static void main(String[] args) {

        GenericHeap<Integer> heap= new GenericHeap<>(Integer::compare);
        heap.insert(50);
        heap.insert(30);
        heap.insert(35);
        heap.insert(10);
        heap.insert(20);
        heap.insert(60);
        heap.print();
        heap.deleteRoot();
        heap.print();

        System.out.println("------------------------");
        GenericHeap heap1= new GenericHeap<>(String::compareTo);
        heap1.insert("Mango");
        heap1.insert("Apple");
        heap1.insert("Banana");
        heap1.insert("Orange");
        heap1.insert("Pineapple");
        heap1.print();
        heap1.deleteRoot();
        heap1.print();


    }


}

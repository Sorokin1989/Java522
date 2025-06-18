package homeWork_29;


class MyList {
    int size;
    int capacity;
    int[] arr;

    {
        size = 0;
        capacity = 16;
        arr = new int[capacity];
    }

    private void increaseArr(){
        if (size>=capacity){
            int tmp = capacity;
            capacity = capacity * 2 + 2;
            System.out.println("increase CAPACITY ("+tmp+" => "+ capacity + ")  ");
            int[] result = new int[capacity];
            for (int i = 0; i < size; i++) {
                result[i] = arr[i];
            }

            arr = result;
        }
    }
    private void decreaseArr(){
        if (size <= capacity/4){
            int tmp = capacity;
            capacity = capacity / 2 - 2 ;
            System.out.println("decrease CAPACITY ("+tmp+" => "+ capacity + ")  ");
            int[] result = new int[capacity];
            for (int i = 0; i < size; i++) {
                result[i] = arr[i];
            }

            arr = result;
        }
    }

    public void add(int value) {
        increaseArr();
        arr[size] = value;
        size++;
    }

    public void addSart(int value) {
        increaseArr();
        for (int i = size; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = value;
        size++;
    }


    public void add(int index, int value) {
        if (index >= size) add(value);
        else if (index < 0) addSart(value);
        else {
            increaseArr();

            for (int i = size-1, j = size; i >= 0; i-- , j--) {
                arr[j] = arr[i];
                if (i == index){
                    arr[i] = value;
                    break;
                }
            }
            size++;
        }
    }


    public boolean isEmpty() {
        return size == 0;

    }


    public int size() {
        return size;
    }
    public int capacity() {
        return capacity;
    }

    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return true;
            }
        }

        return false;
    }



    public void removeByFirstValue(int value) {
        if (contains(value)) {
            boolean isOne = true;
            int[] result = new int[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (arr[i] == value && isOne) {
                    isOne = false;
                    continue;
                }
                result[j++] = arr[i];
            }

            arr = result;
            size--;
            decreaseArr();
        }
    }

    public int containsCount(int value){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == value){
                count++;
            }
        }

        return count;
    }



    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


public class HomeWork_29 {
    public static void main(String[] args) {

        MyList myList=new MyList();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(50);

        myList.print();

       // Реализовать метод public void removeByAllValue(int value) с capacity




    }
}

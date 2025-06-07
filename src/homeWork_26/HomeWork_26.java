package homeWork_26;


class MyList {
    int size;
    int[] arr;

    {
        size = 0;
        arr = new int[size];
    }

    public void add(int value) {
        int[] tmp = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }

        tmp[size] = value;
        arr = tmp;
        size++;
    }

    public void addStart(int value) {
        int[] tmp = new int[arr.length + 1];
        tmp[0] = value;

        for (int i = 0; i < arr.length; i++) {
            tmp[i + 1] = arr[i];
        }
        arr = tmp;
        size++;
    }


    public void add(int index, int value) {

        int[] tmp = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        tmp[index] = value;

        for (int i = index; i < arr.length; i++) {
            tmp[i + 1] = arr[i];
        }

        arr = tmp;
        size++;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class HomeWork_26 {
    public static void main(String[] args) {
//Реализовать 2 метода
//
// public void addSart(int value){
//
//    }
//    public void add(int index , int value){
//
//    }
//

        MyList myList = new MyList();

        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.addStart(100);
        myList.addStart(150);

        myList.add(3, 200);
        myList.add(5, 400);


        myList.print();


    }
}

import java.util.*;

public class Array {
    static int data[];
    static Scanner in = new Scanner(System.in);
    static int data1[];
    public static void main(String[] args) {
        int ch=0;
        System.out.println("ARRAY OPERATIONS");
        System.out.println("1. create array data of size 10, \n2. create array of size size, \n3. initialize array with parameter array, \n4.  reverse element of an array, \n5. find maximum element of array, \n6. find average of element of array, \n7. sort element of array, \n 8. display element of array, \n9. search element and return index else return -1, \n10. return size of an array \n11.exit");
        
        while(ch!=11){
            System.out.println("Enter your choice: ");
            ch = in.nextInt();

            switch(ch){
                case 1:
                    Array();
                break;
                case 2:
                    System.out.println("enter the size of an array: ");
                int size = in.nextInt();
                    Array(size);
                break;
                case 3: 
                    Array(data);
                break;
                case 4: 
                    Reverse_an_array();
                break;
                case 5: 
                    int max = Maximum_of_array();
                    System.out.println("Max number in array is :" +max);
                break;
                case 6:
                    int avg = Average_of_array();
                    System.out.println("Average of elements of array :" +avg);
                break;
                case 7:
                    Sorting();
                break;
                case 8:            
                    display();
                break;
                case 9: 
                    System.out.println("Enter the number which you want to search in Array: ");
                    int no = in.nextInt();
                    int index = search(no);
                    System.out.println(no+ " is at index " +index);
                break;
                case 10:
                    System.out.println("size of array is " +size());
                break;
            }
        }
    }
    static void Array(){
        data = new int[10];
        System.out.println("Enter the elements of array: ");
                    for(int i=0; i<10; i++){
                        data[i] = in.nextInt();
                    }
    }  
    static void Array(int size){
        int data2[];
        data2 = new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<size; i++){
            data2[i] = in.nextInt();
        }
    }
    static void Array(int data[]){
        data1 = new int[data.length];
        for(int i=0; i<data.length; i++){
            data1[i] = data[i];
        }
    }
    static void Reverse_an_array(){
        System.out.println();
        for(int i=data.length-1; i>=0; i--){
            System.out.print(data[i]+ " ");
        }
        System.out.println();
    }
    static int Maximum_of_array(){
        int max = data[0];
        for(int i=0; i<data.length; i++){
            if(data[i]>=max){
                max = data[i];
            }
        }
        return max;
    }
    static int Average_of_array(){
        int avg = 0;
        for(int i=0; i<data.length; i++){
            avg = avg + data[i];
        }
        avg = avg / data.length;
        return avg;
    }
    static void Sorting(){
        for(int i=0; i<data.length-1; i++){
            for(int j=i+1; j<data.length; j++){
                if(data[i]>=data[j]){
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
    static void display(){
        System.out.println("Elements of Array: ");
        System.out.println();
        for(int i=0; i<data.length; i++){
            System.out.print(data[i]+ " ");
        }
        System.out.println();
    }
    static int search(int no){
        int in = -1;
        for(int i=0; i<data.length; i++){
            if(data[i]==no){
                in = i;
                break;
            }
        }
        return in;
    }
    static int size(){
        return data.length;
    }
}

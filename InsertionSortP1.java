import java.util.Scanner;

public class InsertionSortP1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();//enter the array size
        int myArray[] = new int[size];//provision for an array of a given size
        //int shiftCount = 1;//used to right shift the digits
        boolean end = false;

        for(int i=0; i<size; i++){
            myArray[i] = input.nextInt();
        }

        int last = myArray[size-1];//keeps last array element

        for(int j=1;j<size&&!end;j++){

            if(last < myArray[size-j-1]){//shift right if the next is less than last
                myArray[size-j] = myArray[size-j-1];
            }else{//if not, copy last at next position
                myArray[size-j] = last;
                end = true;
            }

            //prints the array after shifting it left
            for(int k=0;k<size;k++){
                System.out.print(myArray[k]+" ");
            }System.out.println();//jumps to the next line

            //if the first is reached, I have to copy the last into the first position,
            //print again and end
            if(j==size-1&&!end){//but don't do this if end is reached
                myArray[size-j-1] = last;
                for(int k=0;k<size;k++){
                    System.out.print(myArray[k]+" ");
                }System.out.println();//jumps to the next line
                end = true;
            }
        }
    }
}
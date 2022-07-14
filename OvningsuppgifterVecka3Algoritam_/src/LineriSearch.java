import java.util.Scanner;

public class LineriSearch {
    public static void main(String[] args) {
        int[] list1 = {2,3,1,4,5,7};
        int[] list2 = {1,3,5,2,6,7};
        Scanner sc = new Scanner(System.in);
        int num;

        println(list1);
        System.out.println("");
        println(list2);
        System.out.println("");
        System.out.println("Sorterat numbers:");
        println(bubbleSortering(list1.clone()));
        System.out.println("");
        println(bubbleSortering(list2.clone()));
        System.out.println("");
        System.out.println("Sorterat number with decreasing");
        println(bubbleSorteringDeacreasing(list1.clone()));
        System.out.println("");
        println(bubbleSorteringDeacreasing(list2.clone()));
        System.out.println("");

        System.out.println("Write a nummber do you see if this have in list1 or list 2");
        num = 0;
        num = writteNumber(list1,num);

       // System.out.println("test: " + num);
        System.out.println("Number in list1: " + LinearSearching(list1, num));
        System.out.println("Number in list2: " + LinearSearching(list2,num));

    }
    public static void println(int[] list){
        if (list.length > 0){
            System.out.print("[");
            for (int i = 0; i < list.length-1 ; i++){
                System.out.print(list[i] + ",");
            }
            System.out.print(list[list.length-1]+ "]");
        }
    }
    public static int[] bubbleSortering(int[] list){
        boolean swapping = true;
        while(swapping){
            swapping = false;
            for (int i = 0; i <= list.length - 2; i++){
                if (list[i] > list[i +1]){
                    int temp = list[i +1];
                    list[i +1] = list[i];
                    list[i] = temp;
                    swapping = true;
                }
            }
        }
        return list;
    }
    public static int[] bubbleSorteringDeacreasing(int[] list){
        boolean swapping = true;
        while(swapping){
            swapping = false;
            for (int i = 0; i <= list.length - 2; i++){
                if (list[i] < list[i +1]){
                    int temp = list[i +1];
                    list[i +1] = list[i];
                    list[i] = temp;
                    swapping = true;
                }
            }
        }
        return list;
    }
    public static boolean LinearSearching(int[] list, int elements){
        for(int i = 0; i < list.length - 1; i++){
            if (list[i] == elements){
                return true;
            }
        }
        return false;
    }
    public static int writteNumber(int[] list, int num ) {

        Scanner sc = new Scanner(System.in);
        boolean cheking = true;
        num = sc.nextInt();
        while (cheking) {
            cheking = false;
            if (num < 0 || num > list.length) {
                System.out.println("Number is to low or to high");
                System.out.println("Try agein");
                num = sc.nextInt();
                cheking = true;
            }
        }
        System.out.println("Correct number");
        return num;
    }

}







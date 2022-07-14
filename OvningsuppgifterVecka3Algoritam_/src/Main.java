//public class Main {
//    public static void main(String[] args) {
//        int [] list = {1,3,2,7,6,4,8,2,10};
//
//        printLine(list);
//        System.out.println("");
//        printLine(bubblesortering(list.clone()));
//        System.out.println("");
//        System.out.println("Num exist in list: " + linearSearch(list,1));
//        System.out.println("");
//        rekursiv(1,10);
//    }
//    public static int[] bubblesortering(int[] list){
//        boolean swapping = true;
//        while (swapping){
//            swapping = false;
//            for (int i = 0; i <= list.length - 2; i++ ){
//                if (list[i] > list[ i + 1]){
//                    int temp = list[i + 1];
//                    list[i + 1] = list[i];
//                    list[i] = temp;
//                    swapping = true;
//                }
//            }
//        }
//        return list;
//    }
//    public static void printLine(int[] list){
//        if (list.length > 0 ){
//            System.out.print("[");
//            for (int i = 0; i < list.length -1; i++){
//                System.out.print(list[i] + ",");
//            }
//            System.out.print(list[list.length -1] + "]");
//        }else{
//            System.out.println("[]");
//        }
//    }
//    public static boolean linearSearch (int [] list, int num){
//        for (int i = 0; i < list.length -1; i++){
//            if (list[i] == num){
//                return true;
//            }
//        }
//        return false;
//    }
//    public static void rekursiv(int num1, int num2 ){
//        for(num1++; num1 < num2 -1; num1++ ){
//            System.out.print(num1 + ",");
//
//        }
//        System.out.println(num1);
//    }
//}
//

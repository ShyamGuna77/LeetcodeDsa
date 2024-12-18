
//Q.)  Given an array of positive integers arr[], return the second-largest element from the array. If the second-largest element doesn't exist then return -1.
//
//Note: The second largest element should not be equal to the largest elemen




class SecondLargest {
    public  static int SecondLargest(int arr[]) {

        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }
        int largest = arr[0] ;
        int secondLargest = -1 ;

        for (int i = 1 ; i < arr.length ; i++){
            if(arr[i] > largest ){
                secondLargest = largest;
                largest = arr[i] ;
            }else if (arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i] ;
            }
        }
        return  secondLargest;
    }

    public static void main(String[] args) {
        int arr1 [] = {1,4,7,9,34,65};
        int arr2 [] = {23,54,67,8,6,77};
        int arr3 [] = {123,324,546,7557,866};
        int arr4 [] = {};

        System.out.println("The second Largest element is " + SecondLargest(arr1));
        System.out.println("The second Largest element is " + SecondLargest(arr2));
        System.out.println("The second Largest element is " + SecondLargest(arr3));
        System.out.println("The second Largest element is " + SecondLargest(arr4));
    }

}
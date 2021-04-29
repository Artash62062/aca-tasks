package Day4;

/**
 * @author Artash-PC on 4/28/2021
 * @product IntelliJ IDEA
 * @project Tasks
 */
public class arr {
    public static void main(String[] args) {
        int [] arr = {1,3,2,1};
       boolean f = findif(arr);
        System.out.println(f);
    }

    public static boolean findif (int [] arr) {
        boolean flag = false;
        int counter = 0;
        for (int i = 1; i < arr.length - 1; i++) {
           if((arr[i]< arr[i-1] || arr[i]>arr[i+1])&&(arr[i+1]>arr[i-1])) {
               counter++;
           }
            if(i+1 == arr.length-1 && arr[i-1]<arr[i+1]) {
                counter++;
            }
        }
        if (counter == 1) {
            flag = true;
        }
        return flag;
    }
}

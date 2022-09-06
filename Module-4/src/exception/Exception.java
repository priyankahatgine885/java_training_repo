package exception;

public class Exception {
    public static void main(String[] args) {
        try {
            String[] arr = {"Rohit","Shikar","Virat","Dhoni"};
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }


        }catch(RuntimeException ex){
            System.out.println(ex.toString());
        }
    }
}

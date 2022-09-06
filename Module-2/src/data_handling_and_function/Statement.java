package data_handling_and_function;

import java.util.Scanner;

public class Statement {

    public static void main(final String[] args) {
        final int number = 2;
        final Scanner sc = new Scanner(System.in);
        final int[] emp_id_arr = new int[number];
        final String[] name_arr = new String[number];
        final float[] salary_arr = new float[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter the employee id : ");
            emp_id_arr[i] = sc.nextInt();
            System.out.print("Enter the employee name : ");
            sc.nextLine();
            name_arr[i] = sc.nextLine();
            System.out.print("Enter the employee salary :");
            salary_arr[i] = sc.nextFloat();
        }
        displayEmployeeInfo(emp_id_arr, name_arr, salary_arr);
        displayEmployeeInfo(emp_id_arr, name_arr);
        System.out.print("Enter the employee name to search : ");
        sc.nextLine();
        final String search_Name = sc.nextLine();
        displayEmployeeInfo(search_Name, emp_id_arr, name_arr, salary_arr);
    }

    private static void displayEmployeeInfo(final int[] emp_id_arr, final String[] name_arr, final float[] salary_arr) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%5s %10s %10s ", "ID", "Name", "Salary");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        for (int i = 0; i < emp_id_arr.length; i++) {
            System.out.format("%5d %10s %.2f", emp_id_arr[i], name_arr[i], salary_arr[i]);
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------");
        }
    }

    private static void displayEmployeeInfo(final int[] emp_id_arr, final String[] name_arr) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%5s %10s ", "ID", "Name");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        for (int i = 0; i < emp_id_arr.length; i++) {
            System.out.format("%5d %10s", emp_id_arr[i], name_arr[i]);
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------");
        }
    }

    private static void displayEmployeeInfo(final String searchStr, final int[] emp_id_arr, final String[] name_arr, final float[] salary_arr) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%5s %10s %10s ", "ID", "Name", "Salary");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        for (int i = 0; i < name_arr.length; i++) {
            if (name_arr[i].toLowerCase().contains(searchStr.toLowerCase())) {
                System.out.format("%5d %10s %.2f", emp_id_arr[i], name_arr[i], salary_arr[i]);
                System.out.println();
                System.out.println("-----------------------------------------------------------------------------");
            }
        }
    }
}

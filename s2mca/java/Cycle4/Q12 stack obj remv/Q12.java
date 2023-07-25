import  java.util.*;

public class Q12 {
    public static void main(String[] args) {
    System.out.println("\nName : ANGELA MATHEW");
	System.out.println("Reg.No : SJC22MCA-2005");
	System.out.println("Course Code : 20MCA132");
	System.out.println("Course Name : OOPS LAB");
	System.out.println("Date : 23 JUNE 2023");
	System.out.println("\n-------------------------------------------------------------\n");
        Stack<Integer> st = new Stack<>();
        st.push(11);
        st.push(22);
        st.push(33);
        st.push(44);
        System.out.println("Stack = "+st);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position : ");
        int x = sc.nextInt();
        st.remove(x);
        System.out.println("Stack = "+st);
    }
}


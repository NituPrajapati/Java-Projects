import java.util.*;
    class student {
        int rg_no;
        String branch;
        double cgpa;
       
        public student(int rg_no,double cgpa,String branch){
        this.rg_no=rg_no;
        this.branch=branch;
        this.cgpa=cgpa;
        }
        public void showdata(){
            System.out.println("Registaration No.: "+rg_no+" CGPA: "+cgpa+" Branch: "+branch);
        
        }
    }
        
    public class SDMS {
        static final int student_no = 5;
        static student[] Student = new student[student_no];
        
        static void linear_searchby_rgNo(int rg_no){
            for(student s : Student) {
                if(rg_no == s.rg_no){
                    s.showdata();
                    return;
                }
            }
            System.out.println("Student Not found.");
        }
        static void bubblesort() {
             int n = Student.length;                                           
            for(int i=0;i<n-1;i++){
                for(int j=1;j<n-i-1;j++) {
                    if(Student[j].rg_no > Student[j+1].rg_no) {
                    student temp= Student[j];
                    Student[j] = Student[j+1];
                    Student[j+1]= temp;
                    }
                }
            }
            System.out.println("Student Data sorted According to their registration no.");
            for(student s:Student){
            s.showdata();
        }}

        static void Binary_searchby_rgNo(int rg_no){
            int lb = 0;
            int ub = student_no-1;
            
            while(lb<=ub) {
                int mid = lb + (ub - lb)/2;
                if(rg_no==Student[mid].rg_no) {
                System.out.println("Student data:");
                Student[mid].showdata();
                return;
            }
            else if(mid<rg_no){
               lb = mid + 1; 
            }
            else{
                ub = mid - 1;
            }
        }
        System.out.println("Sorry, Student does not exist.");

        }
        static void InsertionBy_cgpa(){
            for (int i = 0; i< student_no; i++) {
                student current = Student[i];
                int j = i-1;
                while(j >= 0 && current.cgpa<Student[j].cgpa) {
                    Student[j+1] = Student[j];
                    j--;
                } 
                Student[j+1] = current;
            }
            System.out.println("Student Data sorted According to their CGPA.");
            for(student s:Student){
            s.showdata();
            }
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    for(int i=0;i<student_no;i++) {
        System.out.println("Enter the Student Details "+(i+1)+" :");
        System.out.println("Enter the Student registration no.:");
        int rg_no = sc.nextInt();
        
        System.out.println("Enter the student CGPA:");
        double cgpa = sc.nextDouble();
        System.out.println("Enter the Branch :");
        String branch = sc.next();

        Student[i] = new student(rg_no,cgpa,branch);

      }
      int ch;
      while(true){
      System.out.println("1 .linear search by registration number.");
      System.out.println("2 .Bubble sort by registration number.");
      System.out.println("3 .Binary search by registration number.");
      System.out.println("4 .Insertion sort by cgpa.");
      System.out.println("5 .Exit...");

      System.out.println("Enter your Choice:");
      ch = sc.nextInt();
      switch (ch) {
        
        case 1:
            System.out.println("Enter Student registration number to search:");
            int rg_Srch = sc.nextInt();
            linear_searchby_rgNo(rg_Srch);
            break;
        case 2:
            bubblesort();
            break;
        case 3:
            System.out.println("Enter the Student registration number to search using binary search:");
            int bs = sc.nextInt();
            Binary_searchby_rgNo(bs);
            break;
        case 4:
            InsertionBy_cgpa();
            break;
        case 5:
        System.out.println("Thank You To Visit :)");
            System.exit(0);
            break;
      
        default:
        System.out.println("Invalid number.");
            break;
        
      }
    }
    
}
 
}



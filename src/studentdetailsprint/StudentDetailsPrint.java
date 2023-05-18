/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentdetailsprint;

/** Create Local Repositoty in laptop
 *  initialize versioning git
 *  gitconfig file
 *  gitignore file
 *  commit
 * 
 * @author srinivsi
 */
public class StudentDetailsPrint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // array of object decalration
         Student[] list = new Student[3];
         Scanner in = new Scanner (System.in);
         for (int i = 0; i <list.length; i++){
             
             String n = in.next();
             int a = in.nextInt();
             Student s1 = new Student(n,a);
             list[i]=s1;
         }
        
          for (int i = 0; i <list.length; i++){
              System.out.println(list[i].getName()+ " "+list[i].getAge());// otherwise gives location
          }
         
         

         /*s1.setName("parmin");
         s1.setAge(14);
         Student s2 = new Student();
         s2.setName("peter");
         s2.setAge(17);
         list[0]=s1;*/
    }
    
}

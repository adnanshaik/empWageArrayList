import java.util.*;
import java.lang.*;
import java.util.Random;


class Wage
{

        static int absent;

        int checkDays=1;
        int checkHours=0;
        String cname;
        int days=1;
        int a=1;
        int hours;
        int wage, cmpWage;

    Wage(String cname,int days,int hours,int cmpWage)                           //Refactored the code by creating constructor.
    {
        this.cname=cname;
        this.days=days;
        this.hours=hours;
        this.cmpWage=cmpWage;

        while(checkDays!=days && checkHours!=hours)
        {
          checkHours=8*a;
           a++;
           checkDays++;
           int x=Random();
           int y=Attendance(x);
          if(y!=0)
          {
                 wage+=y*cmpWage;
          }
          else
          {
                  absent++;
          }
	}
         System.out.println("Company="+cname+" "+"days="+days+" "+"hours="+hours+" "+"wage="+wage+" "+"absent="+absent);
    }
        public int Attendance(int c)

  {
           int status=0;
                 switch(c)
                {
                 case 1: status=20;
                        break;
                 case 2: status=8;
                        break;
                 case 0:status=0;
                        break;
                }
                return status;

        }

        public int Random()
 {
          int a;
          Random r=new Random();
          a=r.nextInt(3);
          return a;
  }
}

class Empwage
{

         public static void main(String[] args)
        {

        Wage s1=new Wage("apple",24,250,21);
        Wage s2=new Wage("microsoft",22,223,20);
        Wage s3=new Wage("isoft",23,200,20);

        ArrayList<Wage> al=new ArrayList<Wage>();       //creation of arraylist.

        al.add(s1);                                     //storing company data into arraylist.
	al.add(s2);
        al.add(s3);


        Collections.sort(al);


        for(Wage w:al)
        {
                System.out.println(w);
        }

        }

}












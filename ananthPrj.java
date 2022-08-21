import java.util.*;
class seating_arrangement
{
    //String nm[]=new String[100];
    //String add[]=new String[100];
    int i,t,f;
    //String th[];
    //String nm1[];
    //String sb[];
    int[] id =new int[100];
    String[] date =new String[10];
    String[] day =new String[10];
    String sub[]=new String[10];
    String time[]=new String[10];
   // String time2[]=new String[10];
    String[] dur =new String[10];
    String ex1[]=new String[5];

    String[] th1 =new String[10];
    String[] th2 =new String[10];
    String[] th3 =new String[10];
    String[] th4 =new String[10];
    String[] sc1 =new String[10];
    String sc2[]=new String[10];
    String sc3[]=new String[10];
    String sb1[]=new String[10];
    String sb2[]=new String[10];
    String sb3[]=new String[10];
    String sb4[]=new String[10];
    String sc4[]=new String[10];
    String ass1[]=new String[3];
    String ass2[]=new String[3];
    int x,d,k;
    //String cn[]=new String[100];
    Scanner ob=new Scanner(System.in);
    seating_arrangement()
    {
        for(i=0,k=2017101;i<100;i++,k++)
        {
            id[i]=k;
        }
    }
    void menu()
    {

        System.out.println("SEATING ARRANGEMENT MANAGEMENT SYSTEM");
        int ch=0;
        do{
            try{
                Scanner ob=new Scanner(System.in);
                System.out.println("******* MENU-Seating arrangements ********");
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("        1.Entry");
                System.out.println("        2.Allotment");
                System.out.println("        3.Hall_layout_view");
                System.out.println("        4.EXIT");
                System.out.println("        Enter your choice");
                ch=ob.nextInt();
                switch(ch)
                {
                    case 1:
                        Entry();
                        break;
                    case 2:
                        Allotment();
                        break;
                    case 3:
                        Hall_layout_view();
                        break;
                    case 4:
                        System.out.println("    Thank you");
                        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
                        break;
                    default:
                        System.out.println("Choose only from 1-4");

                }
            }catch(Exception e1)
            {
                System.out.println("input exception");
            }
        }while(ch!=4);
    }

    void Entry()
    {
        int x=0;
        do{
            try{
                Scanner ob=new Scanner(System.in);
                System.out.println("-------- SUBMENU-Entry -----------");

                System.out.println("        1.Timetable");
                System.out.println("        2.Examiners");
                System.out.println("        3.Teachers ");
                System.out.println("        4.Assistants");
                System.out.println("        5.Back to menu");
                System.out.println("        enter your choice");
                x=ob.nextInt();
                switch(x)
                {
                    case 1:
                        timetable();
                        break;
                    case 2:
                        examiners();
                        break;
                    case 3:
                        teachers();
                        break;
                    case 4:
                        assistants();
                        break;
                    case 5:
                        break;

                    default:
                        System.out.println("Sorry wrong choice");

                }
            }catch(Exception e1)
            {
                System.out.println("input exception");
            }
        }while(x!=5);
    }

    void timetable()
    {
        System.out.println("Enter 10 SUBJECTS,DATE,DAY,TIME,DURATION");
        for(i=0;i<10;i++)
        {
            System.out.println("Enter date of the examination "+(i+1));
            System.out.println("------------------------------------");
            date[i]=ob.next();
            System.out.println("Enter day of the examination");
            day[i]=ob.next();
            System.out.println("Enter subjects of the examination");
            sub[i]=ob.next();
            System.out.println("Enter time of the examination");
            time[i]=ob.next();
            System.out.println("Enter duration of the examination");
            dur[i]=ob.next();
        }
    }

    void examiners()
    {
        System.out.println("The number of halls in the INSTITUTION are 2");
        System.out.println("Assign 1 Examiners per hall");
        System.out.println("HALL 1");

        for(x=0;x<2;x++)
        {  System.out.println("Examiners for HALL:"+(x+1));
            ex1[x]=ob.next();
        }
    }

    void teachers()
    {

        System.out.println("DATE                        DAY                        SUBJECT");
        System.out.println("------------------------|-------------------------|--------------------------------|");
        System.out.println();
        for(x=0;x<10;x++)
        {
            System.out.println(date[x]+"               "+day[x]+"             "+sub[x]);
            System.out.println("------------------------|-------------------------|--------------------------------|");
            System.out.println();
            System.out.println("Enter  4 teacher for each of Exam , 3 for hall 1 & 1 for hall2");
            System.out.println("Along with the names, enter the school name and subject you take");
            System.out.println("!!::VALIDATION::!!-The teacher who handle the subject same as the exam subject ARE NOT ALLOWED TO DO INVIGILATION-IF THE DO, THEY HAV TO PAY A FINE OF Rs10000");
            System.out.println("HALL 1");
            System.out.println("Teachers:1");
            th1[x]=ob.next();
            System.out.println("school");
            sc1[x]=ob.next();
            System.out.println("subject");
            sb1[x]=ob.next();
            System.out.println("Teachers:2");
            th2[x]=ob.next();
            System.out.println("school");
            sc2[x]=ob.next();
            System.out.println("subject");
            sb2[x]=ob.next();
            System.out.println("Teachers:3");
            th3[x]=ob.next();
            System.out.println("school");
            sc3[x]=ob.next();
            System.out.println("subject");
            sb3[x]=ob.next();
            System.out.println("HALL 2");
            System.out.println("Teachers:1");
            th4[x]=ob.next();
            System.out.println("school");
            sc4[x]=ob.next();
            System.out.println("subject");
            sb4[x]=ob.next();

        }




    }

    void assistants()
    {
        System.out.println("Input 4 assistant's name for each hall");
        System.out.println("HALL 1");
        {
            for(d=0;d<3;d++)
                ass1[d]=ob.next();
        }
        System.out.println("HALL 2");
        {
            for(d=0;d<3;d++)
                ass2[d]=ob.next();
        }


    }
    void Allotment()
    {
        {
            int y;
            Scanner ob=new Scanner(System.in);
            System.out.println("1:Subject_wise_allotment");
            System.out.println("2:All");
            System.out.println("3:back_to_menu");
            System.out.println("choose your choice");
            y=ob.nextInt();
            switch(y)
            {
                case 1:
                    subject();
                    break;
                case 2:
                    all();
                    break;
                case 3 : break;


            }
        }
    }

    void subject()
    {
        System.out.println("Subjects:");
        for(i=0;i<date.length;i++)
        {
            System.out.println(sub[i]);
        }
        System.out.println("enter a subject");
        String subj=ob.next();
        for(i=0;i<date.length;i++)
        {
            if(sub[i].equalsIgnoreCase(subj))
            {
                System.out.println("exam date:"+date[i]);
                System.out.print("subject:"+sub[i]);
                System.out.println("----------------------------------------------------------------");
                System.out.println("Teacher name     school     subject handled  ");
                System.out.println(th1[i]+"     "+sc1[i]+"     "+sb1[i]);
                System.out.println(th2[i]+"     "+sc2[i]+"     "+sb2[i]);
                System.out.println(th3[i]+"     "+sc3[i]+"     "+sb3[i]);
                System.out.println(th4[i]+"     "+sc4[i]+"     "+sb4[i]);
            }
        }
    }

    void all()
    {
        for(i=0;i<date.length;i++)
        {
            System.out.println("exam date:"+date[i]);
            System.out.print("subject:"+sub[i]);
            System.out.println("----------------------------------------------------------------");
            System.out.println("Teacher name     school     subject handled    ");
            System.out.println(th1[i]+"     "+sc1[i]+"     "+sb1[i]);
            System.out.println(th2[i]+"     "+sc2[i]+"     "+sb2[i]);
            System.out.println(th3[i]+"     "+sc3[i]+"     "+sb3[i]);
            System.out.println(th4[i]+"     "+sc4[i]+"     "+sb4[i]);

            System.out.println("enter a letter & enter key to view next Exam info");
            ob.next().charAt(0);
        }
    }


    void Hall_layout_view()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("******* submenu-hall layout view ********");
        System.out.println("1.hall 1");
        System.out.println("2.hall 2");

        System.out.println("3.back to menu");
        System.out.println("choose your choice:");
        x=ob.nextInt();
        switch(x)
        {
            case 1:h1();break;
            case 2:h2();break;

            case 3: break;
        }
    }
    void h1()
    {
        int f,i;

        System.out.println("Assistants :"+ass1[0]+" "+ass1[1]+" "+ass1[2]);
        System.out.println("water                                         EXAMINER");
        System.out.println("Entry");
        System.out.print("row 1\t");
        for(i=1,f=0;f<65;f++)
        {

            System.out.print(id[f]+"  ");

            if((f+1)%5==0)
            {if(i==6)
                System.out.println("\n Invigilator1\t\t\tInvigilator2");
                System.out.print("\nrow "+(++i)+"\t");
            }
        }
        System.out.println("\t\t\t Invigilator3");
    }
    void h2()
    {
        System.out.println("Assistants :"+ass2[0]+" "+ass2[1]+" "+ass2[2]);
        System.out.println("water                                         EXAMINER");
        System.out.println("Entry");

        System.out.print("row 1\t");
        for(i=1,f=65;f<100;f++)
        {

            System.out.print(id[f]+"  ");

            if((f+1)%5==0)
                System.out.print("\nrow "+(++i)+"\t");
        }
        System.out.println("\t\t\tInvigilator4");
    }

}
public class ananthPrj {
    public static void main(String[] args)
    {
        seating_arrangement obj=new seating_arrangement();
        obj.menu();
    }
}

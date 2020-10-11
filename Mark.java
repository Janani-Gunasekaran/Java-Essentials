import java. io. *;
public class Mark
{
    public static void main (String args[])
    {
        Mark m = new Mark();
        m. showMark();
    }
    public void showMark()
    {
        int m1 = 75, m2 = 62, m3 = 89, m4 = 68, m5 = 77;
        int per,total;
        total = m1+m2+m3+m4+m5;
        per = total/5;
        if (per>=91 && per<=100)
        {
            System . out. println ("Grade - O    percentage - "+per);
        }
        else if(per>=81 && per<=90)
        {
            System . out. println ("Grade - A    percentage - "+per);
        }
        else if(per>=71 && per<=80)
        {
            System . out. println ("Grade - B    percentage - "+per);
        }
        else if(per>=61 && per<=70)
        {
            System . out. println ("Grade - C    percentage - "+per);
        }
        else if(per>=51 && per<=60)
        {
            System . out. println ("Grade - D    percentage - "+per);
        }
        else if(per>=35 && per<=50)
        {
            System . out. println ("Grade - E    percentage - "+per);
        }
        else
        {
            System . out . println ("Fail    percentage - "+per);
        }
    }
}
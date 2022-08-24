import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Adyl adyl = new Adyl(1253456,"Adyl","Adylov",20,"adyl@gmail.com","Bishkek");
        Asan asan = new Asan(1124223,"Asan","s",20,"sdaf@dfs","bishkek");
        Uson uson =new Uson(1243224,"Uson","Usonov",19,"Uson@mailru","Tokmok");
        Akyl akyl = new Akyl(4324322,"Akyl","Akylov",17,"akyl@gmal.com","Osh");
        Ainur ainur = new Ainur(754343,"Ainur","Asanova",18,"ainur@gmail.com","Moscow");
        People[]people = {adyl,asan,akyl,ainur,uson};

        Adyl[]adyls = new Adyl[1];//size jonle 1 berip koidum, glavnyi people sizenynan chon je barabar bolso boldu
        Asan[]asans = new Asan[1];
        Uson[] usons = new Uson[1];
        Akyl[]akyls = new Akyl[1];
        Ainur[]ainurs = new Ainur[1];

        int i = 0; //massicterdi tolturush uchun counterler
        int w = 0;
        int r = 0;
        int t = 0;
        int q = 0;
        for (People p:
             people) {
            if(p instanceof Adyl){
                adyls[i]=(Adyl)p;
                i++;
            } else if (p instanceof Asan) {
                asans[w]=(Asan)p;
                w++;
            } else if (p instanceof Uson ){
                usons[r]=(Uson) p;
            } else if (p instanceof Akyl) {
                akyls[t]=(Akyl)p;
            } else if (p instanceof Ainur) {
                ainurs[q]=(Ainur)p;
            }

            for (People p1 :
                 people) {
                System.out.println(p1);
                p1.work();
                p1.ToRelax();
                p1.communications();
                p1.timetable();
                System.out.println('\n'+" ");
            }
        }
    }
}
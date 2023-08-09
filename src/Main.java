import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){

            try {
                Scanner sc=new Scanner(System.in);
                String word=sc.nextLine();
                DAYS days=DAYS.valueOf(word);
                switch (days) {
                    case MONDAY -> System.out.println("ДУЙШОМБУ КУНУ ДЖАВА ОКУЙМ");
                    case TUESDAY -> System.out.println("БЕЙШЕМБИ КУНУ ТОЖЕ ДЖАВА");
                    case WEDNESDAY -> System.out.println("ШАРШЕМБИ ТОЖЕ ДЖАВА");
                    case THUESDAY -> System.out.println("ШЕЙШЕМБИ ДЖАВА ЖАНА АНГЛИС ТИЛИ");
                    case FRIDAY -> System.out.println("ЖУМА ДЖАВА");
                    case SATURDAY -> System.out.println("ИШЕМБИ ОПЯТЬ ДЖАВА");
                    case SUNDAY -> System.out.println(" УРАА ЖЕКШЕМЕМБИ КУНУ САБАК ЖОК ");

                }}catch(RuntimeException e ) {
                        System.out.println("туура эмес");
                    }
              }}}

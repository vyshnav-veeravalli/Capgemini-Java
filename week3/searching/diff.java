package week3.searching;

public class diff {
    public static void main(String[] args){
        String[] arr = {"lakshmi", " ", "sailaja", " ", "audit", " ", "officer"};
        StringBuffer sbf = new StringBuffer();
        StringBuilder sbd = new StringBuilder();
        long buffertimesatrt = System.nanoTime();
        for(String a: arr){
            sbf.append(a);
        }
        System.out.println(sbf);
        long buffertimeend = System.nanoTime();
        long timetakensbf = buffertimeend - buffertimesatrt;
        System.out.println(timetakensbf);

        long buildertimesatrt = System.nanoTime();
        for(String a: arr){
            sbd.append(a);
        }
        System.out.println(sbf);
        long buildertimeend = System.nanoTime();
        long timetakenbld = buildertimeend - buildertimesatrt;
        System.out.println(timetakenbld);
        if(timetakenbld>timetakensbf){
            System.out.println("string buffer took less time than string builder");
        }
        else{
            System.out.println("string builder took less time than string buffer");
        }

    }
}

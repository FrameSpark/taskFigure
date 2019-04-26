package Figure;

public class FigureFunc {

    public static void checkContains(Figure[] figures, Point[] points){
        boolean entry = false;
        String result;
        for(int i=0; i<points.length;i++){
           result = "Point " + "("+i + ") enters";
            for(int j=0; j<figures.length;j++){
                if(figures[j].contains(points[i])){
                    entry = true;
                    result +=" " + j;
                }
            }
            if(!entry)
               result +=" in null figures";
            entry = false;
            System.out.println(result);
            result="";
        }
    }
}

public class max_points_on_a_line {
    public static void main(String[] args) {

    }
    public int maxPoints(Point[] points){
        if(points.length==0){
            return 0;
        }
        int res=1;
        int max=1;
        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
                if(((points[i].x==points[j].x)&&(points[i].y==points[j].y))||(points[i].x-points[j].x)/(points[i].y-points[j].y)==1){
                    res++;
                }
            }
            max=max>res?max:res;
        }
        return max;
    }
}

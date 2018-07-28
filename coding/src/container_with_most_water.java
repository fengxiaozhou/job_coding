public class container_with_most_water {
    public static void main(String[] args) {
        System.out.print(maxArea(new int[]{1,2,1}));
    }

    /**
     *
     * @param height
     * @return
     *
      for(int i = 0,j = height.size()-1;i<j;)
       {
            MAXI = max(min(height[i],height[j])*(j-i),MAXI);
            height[i]>height[j]?j--:i++;
        }
     */
    public static int maxArea(int[] height) {
        if(height.length==2){
            return Math.min(height[0],height[1]);
        }
        int i=0;
        int j=height.length-1;
        int max=height[i]>height[j]?(height[j]*(j)):(height[i]*(j));
        while (i!=j){
            int area;
            if (height[i]>height[j]){
                j--;
            }else{
                i++;
            }
            area=Math.min(height[i],height[j])*(j-i);
            max=max>area?max:area;
        }
        return max;
    }
}

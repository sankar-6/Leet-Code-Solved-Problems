class Solution {
    public double average(int[] salary) {
        int max=salary[0];
        int min =salary[0];
        int max_index=0;
        int min_index=0;
        for(int i=0;i<salary.length;i++){
            if(salary[i]>max){
                max=salary[i];
                max_index=i;
            }
            if(salary[i]<min){
                min=salary[i];
                min_index=i;
            }
        }
        salary[max_index]=0;
        salary[min_index]=0;
        double sum=0;
        for(int i=0;i<salary.length;i++){
            sum=sum+salary[i];
        }
        double avg = sum/(salary.length-2);
        return avg;
    }
}

class Solution {
    /*For a static which speed the just in time compiler
    static{
        for(int i=0;i<1000;i++){
            int arr[]={1};
            lemonadeChange(arr);
        }
    }*/
    public static boolean lemonadeChange(int[] bills) {
        int change_five = 0;
        int change_ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                change_five++;
            } else if (bill == 10) {
                if (change_five > 0) {
                    change_five--;
                    change_ten++;
                } else {
                    return false;
                }
            } else { // bill == 20
                if (change_ten > 0 && change_five > 0) {
                    change_ten--;
                    change_five--;
                } else if (change_five >= 3) {
                    change_five -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}

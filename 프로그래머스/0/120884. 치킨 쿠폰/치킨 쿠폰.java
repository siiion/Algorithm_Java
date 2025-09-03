class Solution {
    public int solution(int chicken) {
        int serviceChicken = 0;
        int coupon = chicken;
        
        while (coupon >= 10) {
            int newService = coupon / 10;
            serviceChicken += newService;
            
            int remainingCoupon = coupon % 10;
            
            coupon = remainingCoupon + newService;
        }
        
        return serviceChicken;
    }
}
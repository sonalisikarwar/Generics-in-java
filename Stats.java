
package shivaafoundation.javatutorial;
/*class Stats <T>{
    T[] nums;
    stats(T[] o){
        nums =o;
        }
    double average(){
        double sum =0.0;
        for(int i=0; i<nums.length;i++)
            sum += nums[i].doubleValue();//error
        return sum/nums.length;
    }
    
    
}*/
class Stats <T extends Number>{
    T[] nums;
    stats(T[] o){
        nums =o;
        }
    double average(){
        double sum =0.0;
        for(int i=0; i < nums.length;i++)
            sum += nums[i].doubleValue();//error
        return sum/nums.length;
    }
    
    
}

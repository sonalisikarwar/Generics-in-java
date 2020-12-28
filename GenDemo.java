package shivaafoundation.javatutorial;
class GenDemo {
    public static void main(String args[]){
        //create gen reference for integers
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);
    //show the type of data used iOb
    iOb.showtype();
    //Get the values in iOb.Notice that.
    int v =iOb.getob();
    System.out.println("value  :"+ v);
    System.out.println();
    //create a gen object for strings
    Gen<String> strOb = new Gen<String>("Generics Test");
    
    //show the type of data used by strOb
    strOb.showType();
    String str = strOb.getob();
    System.out.println("value :"+ str);
    }  
}

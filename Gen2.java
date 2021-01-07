
package shivaafoundation.javatutorial;
 class Gen2<T> {
    T ob;
    Gen2(T o){
        ob=0;
    }
        //return ob
        T getob(){
        return ob;
    }
    }
    //subclass of Gen2
    class Gen1<T>extends Gen2<T> {
        Gen(T o){
            super (o);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shivaafoundation.javatutorial;

interface MinMax <T extends Comparable<T>implements MinMax<T>{
T min()
T max()

}
class MyClass<T extends Comparable<T> implements MinMax<T>{
    T[] vals;
    MyClass(T[] o) {vals =o;}
    public T min(){
        T v = vals[0];
        for (int i=1; i < vals.length;i++)
            if(vals[i].compareTo(v)<0) v=vals[i];
        return v;
    }
    public T max(){
         T v = vals[0];
        for (int i=1; i < vals.length;i++)
            if(vals[i].compareTo(v)<0) v=vals[i];
        return v;
        
    }
}
class GenIfDemo {
    public static void main(String args[]){
        Integer inums[]={ 3, 2, 8, 6 };
        Character chs[]={'b','r','p','w' };
        MyClass<Integer> iob = new MyClass<Integer>(inums);
       MyClass<Integer> cob = new MyClass<Character>(chs);
        System.out.println("Max value in inums:" +iob.max());
        System.out.println("Min value in inums:" +iob.min());
        System.out.println("Max value in chs:" +cob.max());
        System.out.println("max value in chs:" +cob.min());

    }
    
}

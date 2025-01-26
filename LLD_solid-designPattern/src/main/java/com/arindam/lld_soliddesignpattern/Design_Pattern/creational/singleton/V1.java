package com.arindam.lld_soliddesignpattern.Design_Pattern.creational.singleton;

//this is the version 1 of singleton design pattern
//this is the most basic version of singleton design pattern, not thread safe
public class V1 {
   private static V1 INSTANCE;

   private V1() {
   }

   public static V1 getInstance(){
         if(INSTANCE==null){
              INSTANCE =  new V1();
         }
         return INSTANCE;
   }

}

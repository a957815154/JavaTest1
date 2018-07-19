package com.hand;

public class Factory {



        public static  Intercla getClass(String classtype){
            if(classtype == null){
                return null;
            }
            if(classtype.equalsIgnoreCase("Randomnum")){
                return new Randomnum();
            } else if(classtype.equalsIgnoreCase("Handlelist")){
                return new Handlelist();
            }
            return null;

    }
}

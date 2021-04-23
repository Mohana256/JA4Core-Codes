package com.code;

class TestAge{

static void validate(int age) throws TestInvalidAgeException{
    if(age < 15)
        throw new TestInvalidAgeException("Invalid candidate");
    else
        System.out.println("Valide Candidate");
  }
  
  public static void main(String args[]){
     try{
       validate(12);
     }catch(Exception ex){
        System.out.println("Exception occured: "+ex);
     }

     System.out.println("rest of the code...");
 }
}
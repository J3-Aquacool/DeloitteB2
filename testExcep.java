class NoInteractionException extends Exception
{

 NoInteractionException()
{
System.out.println("No -interaction found");
}




}






class Trainer
{


void askQuestion(String quest,String answer)throws NoInteractionException
{

if(quest!=null && answer==null)
{
throw new NoInteractionException(); 
}

else

{
System.out.println(" Quesion:"+quest);
System.out.println(" Answer:"+answer);

}


}



}





class testExcep
{
public static void main(String a[])throws NoInteractionException
{
Trainer t=new Trainer();


t.askQuestion("What are Lambdas in Java",null);




}

}





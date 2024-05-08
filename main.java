public class Main {
  public static void main(String[] args) {
    
  //Wedesday class
  //Github
  
  //winter, spring, summer, fall
  //warm jacket, t-shirt, swimsuit, raincoat.

    String season = "aumn";
    
    if (season == "winter") {
      System.out.println("Please wear a warm jacket");
    } else if (season == "spring"){
      System.out.println("Please wear a t-shirt");
    } else if (season == "summer"){
      System.out.println("Please wear a swimsuit");
    } else if (season == "autumn"){
      System.out.println("Please wear a raincoat");
    } else {
      System.out.println("Please enter a valid season");
    }
    
    //-20 till +5 super warm
    //+5 - 15 warm
    //15-30 normal
    //30+ cooling

    double temperature = 17.7;
     if (temperature >= -20 && temperature <= 5) {
     System.out.println("Please wear super warm clothes");
     } else if (temperature <= 15){
       System.out.println("Please wear warm clothes");
     } else if (temperature <= 30){
       System.out.println("Please wear normal clothes");
     }else if (temperature <= 30){
          System.out.println("Please wear cooling clothes");
     }

    

    
    
      





    
    
  }

}

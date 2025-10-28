/*
class Vegetable extends Product {

    @Override
    String getName() {
        return "Broccoli";
    }

    @Override
    Date getExpiredDate() {
        return new Date();
    }
}
*/

import java.util.Date;

class Vegetable extends FoodProduct {  
    @Override  
    String getName() {  
        return "Broccoli";  
    }  
    
    @Override  
    Date getExpiredDate() {  
        return new Date();  
    }  
}  
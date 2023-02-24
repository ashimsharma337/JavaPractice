
class Laptop
{    
     String model;
     int price;
    
     
     // Generated hashcode to check if two object are same  with same value
     @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

   
}

public class Demo {
    
    public static void main(String[] args) {
        
        Laptop obj = new Laptop();
        obj.model = "Lenevo";
        obj.price = 1000;

        Laptop obj1 = new Laptop();
        obj1.model = "Lenevo1";
        obj1.price = 1000;

        // System.out.println(obj);  // prints Laptop@73a28541
        System.out.println(obj.toString()); // every time we call object toString() method is called by default

        boolean result = obj1.equals(obj);
        System.out.println(result);
    }
}

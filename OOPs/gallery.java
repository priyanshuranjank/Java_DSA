public class gallery { 
    public static void main(String[] args) {
        ImageProperties ip = new ImageProperties(); // object of class with construtor

        ip.setName("Batman.jpg"); // passing value by using object
        ip.setSize(1024);
        ip.setDim("1920 x 2400");

        System.out.println(ip.getName()); //calling getters
        System.out.println(ip.getSize()+" MB");
        System.out.println(ip.getDim()+" pixels");
        
    }
} 

class ImageProperties{
     private String name;
   private int size;
     private String dimension;
    
    void setName(String title){ //setters
        this.name = title;
    }
    String getName(){ //getters
        return this.name;
    }
    void setSize(int num){
        size = num;
    }
    int getSize(){
        return this.size;
    }
    void setDim(String dim){
        dimension = dim;
    }
    String getDim(){
        return this.dimension;
    }
}
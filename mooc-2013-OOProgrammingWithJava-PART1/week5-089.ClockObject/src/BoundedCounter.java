
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78 
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public void next() {
        if (value < upperLimit) {
            this.value++;
        } else {
            this.value = 0;
        }
    }
        
    public String toString() {
        if(this.value <= 9){
            return "0" + value;
        } else {
            return "" + value;
        }
    }
    
    public int getValue(){
        return this.value;
    }

    public void setValue(int value){
        if(value >= 0 && value <= this.upperLimit){
            this.value = value;
        }
    }
}

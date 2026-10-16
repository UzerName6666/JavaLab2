public class House {
    final private int floor;

    public String toString(){
        if(floor == 0){
            return "дом без этажей";
        }
        if(floor == 1){
            return "дом с 1 этажом";
        }
        return "дом с " + this.floor + " этажами";
    }

    public House(int floors){
        if(floors < 0){
            this.floor = 0;
            return;
        }
        this.floor = floors;
    }

    
}

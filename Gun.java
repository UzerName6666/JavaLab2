public class Gun {
    int bullet;

    public Gun() {
        this.bullet = 5;
    }

    public Gun(int bullet){
        if(bullet < 0){
            this.bullet = 0;
        }
        this.bullet = bullet;
    }

    public String Fire(){
        if(this.bullet > 0){
            this.bullet--;
            return "Бах!";
        }
        return "Клац!";
    }
    
}

public class Time{
    int time;

    public void normalize(){
        while(time < 0){
            time += 86400;
        }
        time = time % 86400;
    }

    public String toString(){
        int ttime = this.time;
        int sec = ttime % 60;
        ttime = ttime / 60;
        int min = ttime % 60;
        ttime = ttime / 60;
        String stime = "";
        if(ttime < 10){
            stime += '0';
        }
        stime += ttime + ":";
        if(min < 10){
            stime += '0';
        }
        stime += min + ":";
        if(sec < 10){
            stime += '0';
        }
        stime += sec;
        return stime;
    }

    public Time(){
        this.time = 0;
    }

    public Time(int sec){
        this.time = sec;
        this.normalize();
    }

    public Time(int minute, int sec){
        this.time = minute * 60 + sec;
        this.normalize();
    }

    public Time(int hour, int minute, int sec){
        this.time = hour * 3600 + minute * 60 + sec;
        this.normalize();
    }

    public Time Add(Time time){
        return new Time(this.time + time.time);
    }

    public Time Add(int time){
        return new Time(this.time + time);
    }


}
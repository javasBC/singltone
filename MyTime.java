import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyTime {
    // one instance
    // public method
    // create when request
    //DATA
    private  String time;
    private static MyTime instance;

    //FUNC
    private MyTime(){}

    public static MyTime getInstance(){
        if (instance==null)
            instance= new MyTime();
        return instance;
    }

    public String getTime(){
        return  setTime();
    }

    public String setTime() {
        this.time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        return this.time;
    }


}

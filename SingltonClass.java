public class SingltonClass {

    private String name;
    private static SingltonClass instance= null;
    MyTime t6 = MyTime.getInstance();
    //cannot create  more than 1 instance
    private SingltonClass(String name){
        this.name=name;
    }

    //if instance does not exist when requested -> create it
    //allow public access to the 1 instance
    public synchronized static SingltonClass getInstance(){
        if (instance==null)
            instance=new SingltonClass("hodi");
        return instance;
    }






}

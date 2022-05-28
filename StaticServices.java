
/**
 * Created by Yarden on 28/02/2017.
 * class that help to hold the the static service for connection to the server.
 */
//use this for static Services to get access from all the app activitys.
public class StaticServices {
    /**
     * The Reciver.
     * this obj hold the
     */
    static Connection_class reciver;
    /**
     * The Myuser.
     * this obj hold the current username of this client.
     */
    static String Myuser;
    /**
     * The My hidden status.
     * this obj hold the status of the client
     */
    static String MyHiddenStatus;

    /**
     * Instantiates a new Static services.
     *this method create the connection with the server every time you launch the app
     * @param ip         the ip
     * @param Myusername the myusername
     * @param MyStatus   the my status
     */
    public StaticServices(String ip,String Myusername,String MyStatus) {
        this.reciver = new Connection_class(ip);
        this.Myuser=Myusername;
        this.MyHiddenStatus=MyStatus;
    }

    public static Connection_class getReciver() {
        return reciver;
    }

    public static String getMyuser() {
        return Myuser;
    }

    public static void setMyuser(String user) {
        Myuser=user;
    }

    public static String getMyStatus() {
        return MyHiddenStatus;
    }

    public static void setMyStatus(String status) {
        MyHiddenStatus=status;
    }

}

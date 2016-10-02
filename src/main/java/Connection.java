/**
 * Created by nazhirjackson on 9/27/16.
 */
public interface Connection {


    public String connect();


    public void setPort(int port);

    public void setiP(String iP);

    public void setProtocol(String protocol);

    public int getPort();

    public String getiP();

    public String getProtocol();
}

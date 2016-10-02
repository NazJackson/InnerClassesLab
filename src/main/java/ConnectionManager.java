/**
 * Created by nazhirjackson on 9/27/16.
 */
public class ConnectionManager{

     private int connection = 0;

        public ManagedConnection getHttpConnection(String iP){
            if(connection>5){
                return null;
            }
            return new ManagedConnection(iP, "HTTP");
        }
    public ManagedConnection getFTPConnection(String iP){
        if(connection>5){
            return null;
        }
        return new ManagedConnection(iP, "FTP");
    }
    public ManagedConnection getQOTDConnection(String iP){
        if(connection>5){
            return null;
        }
        return new ManagedConnection(iP, "QOTD");
    }
    public ManagedConnection getQOTDConnection(String iP, String protocol, int port){
        if(connection>5){
            return null;
        }
        return new ManagedConnection(port, iP, protocol);
    }
    class ManagedConnection implements Connection{
        private int port = 8080;
        private String iP = " ";
        private String protocol = "HTTP";

        public ManagedConnection(int port, String iP, String protocol){
                this.protocol = protocol;
                this.port = port;
                this.iP = iP;
                System.out.println(connect());
            }
        public ManagedConnection( String iP, String protocol){
            this.protocol = protocol;
            this.iP = iP;
            System.out.println(connect());
        }


        public void setPort(int port) {
            this.port = port;
        }

        public void setiP(String iP) {
            this.iP = iP;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        public int getPort() {
            return port;
        }

        public String getiP() {
            return iP;
        }

        public String getProtocol() {
            return protocol;
        }

        public String connect(){
            String connected = ("Address "+iP+" is now connected at "+port+" with the protocol of " +protocol);
            return connected;
        }


    }
}

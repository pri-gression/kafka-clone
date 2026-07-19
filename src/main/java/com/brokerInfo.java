package com.simpleKafka.broker; /* Address of this file */

public class brokerInfo { /* Public class -  any other code is allowed to access this class */
    private final int id;
    private final String host; /* Private: No other code can access this information, only access is the getter methods below */
    private final int port; /* Fixed final data, immutable */

    public BrokerInfo(int id, String host, int port) {
        this.id = id; 
        this.host = host;
        this.port = port; /* method with no return type - constructor */ 
    }

    public int getId(){
        return id;
    }

    public String getHost(){
        return host;
    }

    public int getPort(){
        return port;
    } 

    @Override 
    public String toString(){
        return "BrokerInfo {id = " + id + ", host = " + host + ", port = " + port + "}";
    }

    @Override 
    public boolean equals(Object obj){
        if (this == obj) return true; /* Objects pointing to the same memory */
        if (obj == null || getClass() != obj.getClass()) return false;  /*If object ir null or object from a different class */
        BrokerInfo other = (BrokerInfo) obj;
        return id == other.id;
    }

    @Override 
    public int hashCode() {
        return Integer.hashCode(id);
    }
}

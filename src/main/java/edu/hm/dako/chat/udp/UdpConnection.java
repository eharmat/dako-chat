package edu.hm.dako.chat.udp;

import edu.hm.dako.chat.connection.Connection;
import edu.hm.dako.chat.connection.ConnectionTimeoutException;

import java.io.Serializable;

/**
 * Implementierung der UDP-Verbindung
 *
 * @author E.Nicole Harmat
 *
 */
public class UdpConnection implements Connection {

    @Override
    public Serializable receive(int timeout) throws Exception, ConnectionTimeoutException {
        return null;
    }

    @Override
    public Serializable receive() throws Exception {
        return null;
    }

    @Override
    public void send(Serializable message) throws Exception {

    }

    @Override
    public void close() throws Exception {

    }
}

package edu.hm.dako.chat.udp;

import edu.hm.dako.chat.connection.Connection;
import edu.hm.dako.chat.connection.ConnectionFactory;
import edu.hm.dako.chat.udp.UdpConnection;

import java.io.IOException;
import java.net.BindException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Erzeugen von UDP-Verbindungen zum Server
 *
 * @author E.Nicole Harmat)
 */
public class UdpConnectionFactory {

}






  // Maximale Anzahl an Verbindungsaufbauversuchen zum Server, die ein Client
  // unternimmt, bevor er abbricht
 /* private static final int MAX_CONNECTION_ATTEMPTS = 50;

  // Zaehlt die Verbindungsaufbauversuche, bis eine Verbindung vom Server
  // angenommen wird
  private long connectionTryCounter = 0;
  private int serverPort;

  /** Baut eine Verbindung zum Server auf. Der Verbindungsaufbau wird mehrmals versucht. */
 /* public Connection connectToServer(int serverPort) {
    this.serverPort = serverPort;

    UdpConnection connection = null;
    boolean connected = false;

    // Es wird "localhost" fuer die lokale IP-Adresse verwendet
    InetAddress localAddress = null;

    int attempts = 0;
    while ((!connected) && (attempts < MAX_CONNECTION_ATTEMPTS)) {

      connectionTryCounter++;

      connection = new DatagramSocket(int port);
      connected = true;

      // Ein wenig warten und erneut versuchen
      attempts++;
    }

    return connection;
  } */

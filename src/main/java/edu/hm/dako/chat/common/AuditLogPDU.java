package edu.hm.dako.chat.common;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Vector;

import edu.hm.dako.chat.server.ServerStartData;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Nachrichtenaufbau fuer AuditLog-Protokoll (fuer alle Nachrichtentypen: Request, Response, Event,
 * Confirm)
 *
 * @author E.Nicole Harmat
 */
public class AuditLogPDU {

  // Typ des Protokoll-Datensatzes
  private PduType pduType;
  // Name des Clients, von dem ein Event initiiert wurde
  private String eventUserName;
  // Identifikation des verarbeitenden Worker-Threads im Chat-Server
  private String serverThreadName;
  // Identifikation des verarbeitenden Threads im Chat-Client
  private String clientThreadName;
  // Inhalt der Chat-Nachricht
  private String message;
  private String pdu;

  public AuditLogPDU(ChatPDU chatPDU) {
    this.pdu = chatPDU.toString();
    this.pduType = chatPDU.getPduType();
    this.eventUserName = chatPDU.getEventUserName();
    this.serverThreadName = chatPDU.getServerThreadName();
    this.clientThreadName = chatPDU.getClientThreadName();
    this.message = chatPDU.getMessage();
  }

  // Zeitstempel der Erzeugung der Audit-Log Nachricht
  private String now = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date());
}

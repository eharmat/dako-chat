package edu.hm.dako.chat.common;

import java.io.Serializable;
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
  PduType pduType;
  private String userName;

  public AuditLogPDU() {
    // this.pduType = PduType. CHAT_MESSAGE_EVENT;
  }

  public PduType getPduType() {
    return pduType;
  }

  /*public ServerStartData getStartTime() {
      return getStartTime();
  }*/

  /*public long getServerTime() {
    return getServerTime();
  }*/

  public String getUserName() {
    return userName;
  }

  public String getServerThreadName() {
    return getServerThreadName();
  }

  public String getClientThreadName() {
    return getClientThreadName();
  }

  public String getMessage() {
    return getMessage();
  }
}

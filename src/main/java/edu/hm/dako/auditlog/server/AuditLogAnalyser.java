package edu.hm.dako.auditlog.server;

import edu.hm.dako.chat.common.AuditLogPDU;
import edu.hm.dako.chat.common.ChatPDU;
import edu.hm.dako.chat.common.DistributionMetrics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;

public class AuditLogAnalyser {

  /*AuditLogPDU auditLogPDU = new AuditLogPDU(ChatPDU chatPDU);


  public static void main(String[] args) {
      try {
          Files.write(Paths.get("main_output.txt"), "Some new text".getBytes());

      } catch (IOException e) {
          e.printStackTrace();
      }

      public synchronized void writeStatisticSet(String fileName, String implType,
              String measureType, String startTime, String endTime, float averageCpuTime) {

          File file = new File(fileName);

          // Verteilungsmetriken berechnen
          DistributionMetrics distr = calculateMetrics();

          // Datei anlegen, wenn notwendig
          try {
              boolean exist = file.createNewFile();
              if (!exist) {
                  log.debug("Datei " + fileName + " existierte bereits");
              } else {
                  log.debug("Datei " + fileName + " erfolgreich angelegt");
              }

              // Datei zum Erweitern oeffnen
              FileWriter fstream = new FileWriter(fileName, true);
              BufferedWriter out = new BufferedWriter(fstream);

              StringBuilder sb = new StringBuilder();
              Formatter formatter = new Formatter();

              sb.append(formatter.format(
                      "%s | %s | %d | %d | "
                              + "%05.2f | %05.2f | %05.2f | %05.2f | %05.2f | %05.2f | %05.2f | %05.2f | %05.2f | %05.2f |  %05.2f |  %05.2f | "
                              + "%d | %d | %d | %d | %d | %d | %d | %d | %d | %d | %02.2f | %s | %s%n",
                      measureType, implType, numberOfClients, numberOfMessages,
                      distr.getPercentile10(), distr.getPercentile25(), distr.getPercentile50(),
                      distr.getPercentile75(), distr.getPercentile90(), distr.getRange(),
                      distr.getInterquartilRange(), distr.getMinimum(), distr.getMaximum(),
                      distr.getMean(), distr.getStandardDeviation(),
                      this.getAverageServerTime() / 1000000.0, this.numberOfAllMessages,
                      this.getNumberOfSentRequests(), this.getNumberOfReceivedResponses(),
                      this.getNumberOfLostResponses(), this.getSumOfAllRetries(),
                      this.getSumOfAllSentEventMessages(), this.getSumOfAllReceivedConfirmEvents(),
                      this.getSumOfAllLostConfirmEvents(), this.getSumOfAllRetriedEvents(),
                      this.getMaxHeapSize() / (1024 * 1024), (double) (averageCpuTime * 100),
                      startTime, endTime));

              out.append(sb);
              formatter.close();

              System.out.println("Auswertungssatz in Datei " + fileName + " geschrieben");

              out.flush();
              out.close();

          } catch (IOException e) {
              log.error("Fehler beim Schreiben des Auswertungssatzes in Datei " + fileName);
          }
      }


  }*/
}

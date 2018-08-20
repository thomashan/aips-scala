package thomashan.github.io

import java.io.{File, FileInputStream}

import thomashan.github.io.output.{DailyTotalsWriter, LineEntriesWriter}
import thomashan.github.io.report.{DailyTotalsReport, LeastCarsIn3WindowReport, Top3Report, TotalsReport}

object AppRunner extends App {
  if (args.length != 1) {
    throw new IllegalArgumentException("Please specify the input file")
  }

  val fileName = args(0)

  val entries = LineEntryReader.read(new FileInputStream(new File(fileName)))
  println(s"File ${fileName} read")

  val totals = new TotalsReport(entries).output()
  val dailyTotals = new DailyTotalsReport(entries).output()
  val top3Counts = new Top3Report(entries).output()
  val leastCarsIn3Windows = new LeastCarsIn3WindowReport(entries).output()

  println(
    s"""
       |- Total cars:
       |${totals}
       |
       |- Daily total cars:
       |${new DailyTotalsWriter(dailyTotals).output()}
       |
       |- Top 3 half hours
       |${new LineEntriesWriter(top3Counts).output()}
       |
       |- Least cars in three windows
       |${new LineEntriesWriter(leastCarsIn3Windows).output()}
       |
    """.stripMargin)

}

package thomashan.github.io.report

import thomashan.github.io.LineEntry

class LeastCarsIn3WindowReport(entries: Seq[LineEntry]) extends Report[Seq[LineEntry]] {
  override def output(): Seq[LineEntry] = entries
    .sliding(3)
    .map(e ⇒ e(0).localDateTime → (e, e.map(_.count).sum))
    .minBy(_._2._2)
    ._2._1
}

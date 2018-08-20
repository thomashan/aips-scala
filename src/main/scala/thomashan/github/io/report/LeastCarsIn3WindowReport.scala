package thomashan.github.io.report

import thomashan.github.io.{LineEntry, Report}

class LeastCarsIn3WindowReport extends Report[Seq[LineEntry]] {
  override def output(entries: Seq[LineEntry]): Seq[LineEntry] = entries
    .sliding(3)
    .map(e ⇒ e(0).localDateTime → (e, e.map(_.count).sum))
    .minBy(_._2._2)
    ._2._1
}

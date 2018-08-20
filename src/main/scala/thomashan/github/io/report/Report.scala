package thomashan.github.io.report

trait Report[O] {
  def output(): O
}

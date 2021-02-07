import scala.io.StdIn.readLine

object Converter extends App {
  println("")
println ("Temperature Converter - Celsius & Fahrenheit")
  println("")
  val myTemperature = readLine ("Enter temperature and letter (F to convert Fahrenheit to Celsius or C to convert Celsius to Fahrenheit): ")
if (myTemperature.endsWith("F")) {
  println(s"${(myTemperature.replace("F", "").toInt - 32) / 1.8}°C")
} else {
  println(s"${myTemperature.replace("C","").toInt * 1.8 + 32}°F")
}
}

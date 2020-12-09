package CustomObserver

public class CurrentConditionsDisplay(_weatherData: Subject) : Observer,
    DisplayElement {
    var temperature: Float? = null
    var humidity: Float? = null
    var pressure: Float? = null
    var weatherData: Subject? = null

    init {
        weatherData = _weatherData
        weatherData!!.registerObserver(this)
    }

    override fun display() {
        println("Current Conditions: temperature: $temperature, humidity: $humidity, pressure: $pressure,")
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        display()
    }
}

fun main() {
    val weatherData: WeatherData = WeatherData()

    val currentConditionsDisplay: CurrentConditionsDisplay =
        CurrentConditionsDisplay(weatherData)
    val headIndexDisplay: HeatIndexDisplay =
        HeatIndexDisplay(weatherData)

    weatherData.setMeasurements(80f, 65f, 30.4f)
    println("--------")
    weatherData.setMeasurements(80f, 2f, 30.234f)
}
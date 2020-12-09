package CustomObserver

import CustomObserver.Observer
import CustomObserver.Subject

class WeatherData: Subject {
    private val observers: ArrayList<Observer> = ArrayList<Observer>()
    private var temperature: Float = -1f
    private var humidity: Float = -1f
    private var pressure: Float = -1f

    override fun registerObserver(observer: Observer) {
        this.observers.add(observer)
    }

    override fun notifyObservers() {
        for (observer in this.observers) {
            observer.update(temperature, humidity, pressure)
        }
    }

    override fun removeObserver(observer: Observer) {
        val index = this.observers.indexOf(observer)
        if (index >= 0) {
            this.observers.removeAt(index)
        }
    }

    // called by outside program
    public fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }

    fun measurementsChanged() {
        notifyObservers()
    }

}
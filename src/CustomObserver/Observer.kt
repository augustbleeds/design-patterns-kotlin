package CustomObserver

interface Observer {
    fun update(temperature: Float, humidity: Float, pressure: Float): Unit
}
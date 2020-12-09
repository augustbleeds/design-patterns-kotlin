package Strategy

public class MallardDuck: Duck() {

    init {
        quackBehavior = MallardQuack()
        flyBehavior = MallardFly()
    }


}

fun main() {
    val mallardDuck = MallardDuck()
    mallardDuck.performFly()
    mallardDuck.performQuack()
}
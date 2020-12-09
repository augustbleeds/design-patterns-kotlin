package Strategy

public open class Duck {
    var quackBehavior: QuackBehavior? = null
    var flyBehavior: FlyBehavior? = null

    open fun performQuack(): Unit {
        quackBehavior?.quack()
    }

    open fun performFly(): Unit {
        flyBehavior?.fly()
    }
}
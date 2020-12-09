package Strategy

public class DittoDuck(_flyBehavior: FlyBehavior, _quackBehavior: QuackBehavior) : Duck() {

    init {
        flyBehavior = _flyBehavior
        quackBehavior = _quackBehavior
    }
}

// which constructor will be used?

//fun Strategy.CustomObserver.main() {
//    val dittoDuck: DittoDuck =
//        DittoDuck(Strategy.MallardFly(), Strategy.MallardQuack())
//    dittoDuck.performFly()
//    dittoDuck.performQuack()
//}
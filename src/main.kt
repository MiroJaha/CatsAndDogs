import kotlin.random.Random

fun main(){

    abstract class Animal(){
        abstract var name:String
        abstract var age:Int

        abstract fun talk()
    }

    class Dog(override var name:String,override var age:Int) : Animal() {

        override fun talk() {
            println("$name : Woof - $age Years Old")
        }
    }

    class Cat(override var name:String,override var age:Int) : Animal() {

        override fun talk() {
            println("$name : Meow - $age Years Old")
        }
    }

    val dogs= arrayListOf<Dog>()
    val cats= arrayListOf<Cat>()

    val dognames= listOf("Do","Sam","KoKy","Lily","Packy")
    val catnames= listOf("Pixi","Joli","Laila","Soshi","Mick")

    for (i in dognames)
        dogs.add(Dog(i,Random.nextInt(1,10)))
    for (i in catnames)
        cats.add(Cat(i, Random.nextInt(1,10)))

    for(i in 0 until cats.size) {
        cats[i].talk()
        for(j in 0 until dogs.size)
            if(cats[i].age<dogs[j].age)
                dogs[j].talk()
    }
}
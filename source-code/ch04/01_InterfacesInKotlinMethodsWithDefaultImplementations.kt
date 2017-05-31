package ch04.InterfacesInKotlinMethodsWithDefaultImplementations

interface Clickable {
    fun click()
}
class Button : Clickable {
    override fun click() = println("I was clicked")
}

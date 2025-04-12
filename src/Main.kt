//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }

    println("facePassword $facePassword")
    println("instaPassword $instaPassword")
    println("xPassword $xPassword")

    addNumbers(4,4)

    println("Test from Project1")

    println("Hi I am the second project")
    println("I finished my work")


    println("still in project1")

    println("still in project2")
}

fun addNumbers(x: Int, y:Int) : Int{
    return x + y
}
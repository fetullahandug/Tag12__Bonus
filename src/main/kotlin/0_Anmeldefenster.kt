
fun main(){
    var username: String = ""
    var password: String = ""
    var loginSuccess: Boolean = false

    while(!loginSuccess){
        println("\nBenutzername: ")
        username = readln()
        println("Passwort: ")
        password = readln()

        loginSuccess = tryLoggingIn(username, password)
    }

}

fun tryLoggingIn(username: String, password: String): Boolean{
    val logins: Map<String, String>  = mapOf("Mark" to "12345",
        "Simone" to "55555",
        "Sebastian" to "HalloIchBinSeb",
        "Tim" to "Passwort",
        "Marie" to "MarieIstDieBeste",
        "Nicole" to "NicPrincess1")

    if(logins.contains(username)){
        if(logins[username] == password){
            println("\nLogine erfolgreich!")
            return true
        }
    }

    println("\nBenutzername oder Passwort falsch!\nVersuche es erneut ..")
    return false
}
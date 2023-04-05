fun main() {
    println("안녕하세요!")
    println("이름을 입력해주세요")
    val userName = readlnOrNull() ?: ""
    println("${userName}님, 반갑습니다!")
    saveUserName(userName)
}

private fun saveUserName(userName: String) {
    println("저장: User(name=$userName)")
}
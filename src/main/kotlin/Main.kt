fun main() {
    println("Git 실습 프로젝트를 시작합니다")
    println("이름을 입력해주세요")
    println("안녕하세요!!")
    println("JK 메시지")
    val userName = readlnOrNull() ?: ""
    println("${userName}님, 반갑습니다!")
    saveUserName(userName)
    println("안녕하세요 아이비")
    println("end")
}

private fun saveUserName(userName: String) {
    println("저장: User(name=$userName)")
}
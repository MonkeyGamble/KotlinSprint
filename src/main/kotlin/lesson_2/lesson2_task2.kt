package lesson_2

fun main() {
    val countEmployees: Int = 50
    val salaryPermanentEmployee: Int = 30000

    val countInterns: Int = 20
    val salaryIntern: Int = 2000

    val expencesPermanentEmployees: Int = countEmployees * salaryPermanentEmployee
    val totalExpences: Int = expencesPermanentEmployees + countInterns * salaryIntern
    val averageSalary: Int = totalExpences / (countEmployees + countInterns)

    println("Расходы на выплату зарплаты постоянных сотрудников: $expencesPermanentEmployees")
    println("Общие расходы по ЗП после прихода стажеров: $totalExpences")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary")

}
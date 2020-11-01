@file:Suppress("MayBeConstant", "unused", "UNUSED_VARIABLE")

package day_1_kotlin.langrus.assignments
// workshop #8 - const, companion object, extension func*

/*
 * Сокращаем телефон до максимально допустимой длины maxLength
 * и пишем функцию экстеншен на лист, которая заменяет каждый i-й элемент номером телефона
 */

// TODO 1: make maxLength const that is visible only inside the Person class


// TODO 2: make companionConstant part of companion object


class Person(phoneCode: String) {

    val code = if (phoneCode.length > maxLength) phoneCode.subSequence(0, maxLength) else phoneCode


    companion object {
        val companionConstant = 12
        private const val maxLength = 12
    }

    // * * * Bonus task * * * (work at home)

    //TODO 3: make this fun as extension to a list outside the Person class

}

fun List<Any>.replacePlacesWithThePhoneCode(person: Person, placeNum: Int = 3) : List<Any> {
    return this.mapIndexed { index, any -> if (index % placeNum == 0) person.code else any}
}


fun main(){
    val lst = mutableListOf("1", 3, 4, "Patrick", 3.4, "123-59")

    val p = Person("45-45-45")


    // TODO: uncomment after finishing TODO 1
    println(Person.companionConstant) // since maxLength is not visible outside

    //TODO *: uncomment after doing function
    val changedLst = lst.replacePlacesWithThePhoneCode(p, 4)
    print(changedLst)
}


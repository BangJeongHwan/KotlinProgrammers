package D_20221010

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport
import java.lang.reflect.Type
import java.time.LocalDate
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

// 7.5.3
class Person5(
    val name: String, age: Int, salary: Int
) : PropertyChangeAware() {
    private val observer = {
        prop: KProperty<*>, oldValue: Int, newValue: Int ->
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }
    var age: Int by Delegates.observable(age, observer)
    var salary: Int by Delegates.observable(salary, observer)
}

// PropertyChangeSupport 도우미 클래스
open class PropertyChangeAware {
    protected val changeSupport = PropertyChangeSupport(this)
    fun addPropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.addPropertyChangeListener(listener)
    }
    fun removePropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.removePropertyChangeListener(listener)
    }
}

// 7.5.2
class Person1(val name: String){
//    val emails by lazy { loadEmails1(this) }
    val emails by lazy(true) { loadEmails1(this) }
}
fun loadEmails1(person: Person1): List<Email> {
    println("${person.name}의 이메일을 가져옴")
    return listOf(/* */)
}

class Person(val name: String){
    private var _emails: List<Email>? = null
    val emails: List<Email>
        get() {
            if (_emails == null) {
                _emails = loadEmails(this)
            }
            return _emails!!
        }
}
class Email {}
fun loadEmails(person: Person): List<Email> {
    println("${person.name}의 이메일을 가져옴")
    return listOf(/* */)
}

class Delegate1 (val name: String){

}

class Delegate2 () {
    companion object{
        val name = ""
    }

}
class Delegate {
//    operator fun getValue(){}
//    operator fun setValue(){}
}
fun main() {
    // study
    var a1 = Delegate1("name")
    var a2 = Delegate2()

//    var a3 by Delegate2()



    // 7.5.3
    val p5 = Person5("Brett", 34, 2000)
    p5.addPropertyChangeListener(
        PropertyChangeListener { evt ->
            println("Property ${evt.propertyName} change from ${evt.oldValue} to ${evt.newValue}")
        }
    )
    p5.age = 35
    p5.salary = 3000

    // 7.5.2
    val p1 = Person1("Alice1")
    p1.emails
    p1.emails

    val p = Person("Alice")
    p.emails
    p.emails

    var a: String? = null
    var b: String? = null
    println(a == b) // -> a?.equals(b) ?: (b==null)

    val p3 = Person3("A","Z")
    val p4 = Person3("B","Y")
    println(p3 < p4)


}
class Person3(
    val firstName: String, val lastName: String
) : Comparable<Person3> {
    override fun compareTo(other: Person3): Int {
        return compareValuesBy(this, other, Person3::firstName,Person3::lastName)
    }
}

/*
7.5.1
class Delegate {
    operator fun getValue(){}
    operator fun setValue(){}
}

class Foo{
    var p: Type by Delegate()
}
*/

@file:JvmName("KotlinFX")
@file:JvmMultifileClass
@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx

typealias ReadOnlyProperty<T> = javafx.beans.property.ReadOnlyProperty<T>

typealias ReadOnlyBooleanProperty = javafx.beans.property.ReadOnlyBooleanProperty
typealias ReadOnlyFloatProperty = javafx.beans.property.ReadOnlyFloatProperty
typealias ReadOnlyDoubleProperty = javafx.beans.property.ReadOnlyDoubleProperty
typealias ReadOnlyIntegerProperty = javafx.beans.property.ReadOnlyIntegerProperty
typealias ReadOnlyLongProperty = javafx.beans.property.ReadOnlyLongProperty
typealias ReadOnlyStringProperty = javafx.beans.property.ReadOnlyStringProperty
typealias ReadOnlyObjectProperty<T> = javafx.beans.property.ReadOnlyObjectProperty<T>

typealias ReadOnlyListProperty<E> = javafx.beans.property.ReadOnlyListProperty<E>
typealias ReadOnlySetProperty<E> = javafx.beans.property.ReadOnlySetProperty<E>
typealias ReadOnlyMapProperty<K, V> = javafx.beans.property.ReadOnlyMapProperty<K, V>


typealias Property<T> = javafx.beans.property.Property<T>

typealias BooleanProperty = javafx.beans.property.BooleanProperty
typealias FloatProperty = javafx.beans.property.FloatProperty
typealias DoubleProperty = javafx.beans.property.DoubleProperty
typealias IntegerProperty = javafx.beans.property.IntegerProperty
typealias LongProperty = javafx.beans.property.LongProperty
typealias StringProperty = javafx.beans.property.StringProperty
typealias ObjectProperty<T> = javafx.beans.property.ObjectProperty<T>

typealias ListProperty<E> = javafx.beans.property.ListProperty<E>
typealias SetProperty<E> = javafx.beans.property.SetProperty<E>
typealias MapProperty<K, V> = javafx.beans.property.MapProperty<K, V>


typealias SimpleBooleanProperty = javafx.beans.property.SimpleBooleanProperty
typealias SimpleFloatProperty = javafx.beans.property.SimpleFloatProperty
typealias SimpleDoubleProperty = javafx.beans.property.SimpleDoubleProperty
typealias SimpleIntegerProperty = javafx.beans.property.SimpleIntegerProperty
typealias SimpleLongProperty = javafx.beans.property.SimpleLongProperty
typealias SimpleStringProperty = javafx.beans.property.SimpleStringProperty
typealias SimpleObjectProperty<T> = javafx.beans.property.SimpleObjectProperty<T>

typealias SimpleListProperty<E> = javafx.beans.property.SimpleListProperty<E>
typealias SimpleSetProperty<E> = javafx.beans.property.SimpleSetProperty<E>
typealias SimpleMapProperty<K, V> = javafx.beans.property.SimpleMapProperty<K, V>

inline fun booleanProperty(
        initialValue: Boolean = false,
        name: String = "",
        bean: Any? = null): BooleanProperty {
    return SimpleBooleanProperty(bean, name, initialValue)
}

inline fun floatProperty(
        initialValue: Float = 0.0f,
        name: String = "",
        bean: Any? = null): FloatProperty {
    return SimpleFloatProperty(bean, name, initialValue)
}

inline fun doubleProperty(
        initialValue: Double = 0.0,
        name: String = "",
        bean: Any? = null): DoubleProperty {
    return SimpleDoubleProperty(bean, name, initialValue)
}

inline fun integerProperty(
        initialValue: Int = 0,
        name: String = "",
        bean: Any? = null): IntegerProperty {
    return SimpleIntegerProperty(bean, name, initialValue)
}

inline fun longProperty(
        initialValue: Long = 0,
        name: String = "",
        bean: Any? = null): LongProperty {
    return SimpleLongProperty(bean, name, initialValue)
}

inline fun stringProperty(
        initialValue: String? = null,
        name: String = "",
        bean: Any? = null): StringProperty {
    return SimpleStringProperty(bean, name, initialValue)
}
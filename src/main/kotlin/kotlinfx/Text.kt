@file:JvmName("KotlinFX")
@file:JvmMultifileClass

package kotlinfx

typealias Text = javafx.scene.text.Text

typealias TextAlignment = javafx.scene.text.TextAlignment

typealias TextBoundsType = javafx.scene.text.TextBoundsType

typealias TextFlow = javafx.scene.text.TextFlow


inline fun text(text: String = "", x: Double, y: Double, initializer: Text.() -> Unit = {}): Text {
    return Text(x, y, text).apply(initializer)
}

inline fun textFlow(vararg children: Node, initializer: TextFlow.() -> Unit = {}): TextFlow {
    return TextFlow(*children).apply(initializer)
}

@JvmName("textFlowOfArray")
inline fun textFlow(children: Array<out Node>, initializer: TextFlow.() -> Unit = {}): TextFlow {
    return TextFlow(*children).apply(initializer)
}

inline fun textFlow(children: Collection<Node>, initializer: TextFlow.() -> Unit = {}): TextFlow {
    return TextFlow().apply { this.children.addAll(children) }.apply(initializer)
}
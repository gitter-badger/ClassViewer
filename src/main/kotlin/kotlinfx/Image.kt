@file:JvmName("Image")
package kotlinfx

typealias Image = javafx.scene.image.Image

fun Image.view(): ImageView = ImageView(this)
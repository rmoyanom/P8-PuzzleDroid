package com.puzzle.game.lyLogicalBusiness
import java.io.Serializable

class Picture : Serializable {
    var image:Int? = null

    constructor( image: Int?) {
        this.image = image
    }

/* Función para identifcar una imagen haciendole has
    fun hashBitmap(bmp: Bitmap): Long {
        var hash: Long = 31 //or a higher prime at your choice
        for (x in 0 until bmp.width) {
            for (y in 0 until bmp.height) {
                hash *= bmp.getPixel(x, y) + 31
            }
        }
        return hash
    }
 */
}
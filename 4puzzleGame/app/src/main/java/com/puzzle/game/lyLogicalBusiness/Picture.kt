package com.puzzle.game.lyLogicalBusiness

import android.graphics.Bitmap
import java.io.Serializable

class Picture : Serializable {
     var imgResource : Int = 0

    lateinit var hasPicture: String
    lateinit var rute: String
    var realWidth: Int = 0
    var realHeigth: Int = 0

    var image:Int? = null

    constructor( image: Int?) {
        this.image = image
    }

    fun hashBitmap(bmp: Bitmap): Long {
        var hash: Long = 31 //or a higher prime at your choice
        for (x in 0 until bmp.width) {
            for (y in 0 until bmp.height) {
                hash *= bmp.getPixel(x, y) + 31
            }
        }
        return hash
    }



}
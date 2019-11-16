package com.poetry

import java.util.*

class PoetryReader(val obtainPoem: ObtainPoem?) : RequestVerse {
    constructor() : this(null)

    override fun getPoetry(): String {
        return if(Objects.nonNull(obtainPoem)) {
            obtainPoem!!.getMeSomePoetry()
        } else {
            "Twinkle Twinkle little star"
        }
    }
}

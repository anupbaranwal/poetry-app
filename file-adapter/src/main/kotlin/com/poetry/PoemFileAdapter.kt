package com.poetry

class PoemFileAdapter : ObtainPoem {
    override fun getMeSomePoetry(): String {
        return this.javaClass.getResource("/poem.txt").readText()
    }
}
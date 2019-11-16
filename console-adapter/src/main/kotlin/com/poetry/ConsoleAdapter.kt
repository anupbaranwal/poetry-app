package com.poetry

class ConsoleAdapter(val requestVerse: RequestVerse) {

    fun writeThePoetryToTheConsole() {
        this.requestVerse.getPoetry().also(::println)
    }
}